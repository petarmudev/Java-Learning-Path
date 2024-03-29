package L22_ExerciseTestDrivenDevelopment.Chainblock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ChainblockImplTest {
    private Chainblock database;
    private List<Transaction> transactionList; //list с примерни транзакции

    @Before
    public void setUp() {
        this.database = new ChainblockImpl();
        this.transactionList = new ArrayList<>();
        prepareTransactions();
    }

    private void prepareTransactions() {
        Transaction transaction1 = new TransactionImpl(0, TransactionStatus.SUCCESSFUL, "Petar", "Maya", 150.5);
        Transaction transaction2 = new TransactionImpl(1, TransactionStatus.SUCCESSFUL, "Petar", "Maya", 120.5);
        Transaction transaction3 = new TransactionImpl(2, TransactionStatus.FAILED, "Petar", "Maya", 100.5);
        this.transactionList.add(transaction1);//list с примерни транзакции
        this.transactionList.add(transaction2);//list с примерни транзакции
        this.transactionList.add(transaction3);//list с примерни транзакции
    }

    //1. add
    //1.1 transaction with unique ID
    @Test
    public void testAddCorrectTransaction() {
        Assert.assertEquals(0, this.database.getCount());
        // 0 transactions

        this.database.add(this.transactionList.get(0));
        //1 transactions
        Assert.assertEquals(1, this.database.getCount());

    }

    //1.2 transaction with NON unique ID
    @Test
    public void testAddExistingTransactionID() {
        Assert.assertEquals(0, this.database.getCount());
        // 0 transactions

        this.database.add(this.transactionList.get(0));
        //1 transactions
        Assert.assertEquals(1, this.database.getCount());

        this.database.add(this.transactionList.get(0));
        //1 transactions
        Assert.assertEquals(1, this.database.getCount());

    }


    //2. contains
    //by Transaction and by ID
    @Test
    public void testContains() {
        Assert.assertFalse(this.database.contains(transactionList.get(0)));
        Assert.assertFalse(this.database.contains(transactionList.get(0).getId()));

        this.database.add(this.transactionList.get(0));
        Assert.assertTrue(this.database.contains(transactionList.get(0)));
        Assert.assertTrue(this.database.contains(transactionList.get(0).getId()));
    }

    //3 changeTransactionStatus
    //3.1 find the transaction by the given ID
    @Test
    public void testChangeTransactionStatus() {
        this.database.add(this.transactionList.get(0));

        this.database.changeTransactionStatus(0, TransactionStatus.ABORTED);
        Assert.assertEquals(TransactionStatus.ABORTED, this.transactionList.get(0).getStatus());

    }

    //3.2 We don`t find the given ID
    @Test(expected = IllegalArgumentException.class)
    public void testChangeTransactionStatusWithInvalidID() {
        this.database.add(this.transactionList.get(0));

        this.database.changeTransactionStatus(100, TransactionStatus.ABORTED);
    }

    //4 removeTransactionByID
    //4.1 successfully remove
    @Test
    public void testRemoveTransactionByID() {
        this.database.add(this.transactionList.get(0));
        this.database.add(this.transactionList.get(1));
        Assert.assertEquals(2, this.database.getCount());
        //2 transactions
        int idToTest = this.transactionList.get(1).getId();

        this.database.removeTransactionById(idToTest);

        //1 transaction
        Assert.assertEquals(1, this.database.getCount());
        Assert.assertFalse(this.database.contains(idToTest));

    }

    //4.2 Unsuccessful remove because of not valid ID
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveTransactionByNotValidIDShouldThrow() {
        this.database.add(this.transactionList.get(0));
        this.database.removeTransactionById(5);
    }

    //5. getByID
    //5.1 if the ID exists
    @Test
    public void testGetByID() {
        Transaction transaction = this.transactionList.get(0);
        this.database.add(transaction);
        Transaction returnedTransaction = this.database.getById(0);
        Assert.assertEquals(transaction, returnedTransaction);
        Assert.assertEquals(transaction.getId(), returnedTransaction.getId());
        Assert.assertEquals(transaction.getStatus(), returnedTransaction.getStatus());

        //Assert.assertEquals(transaction.getAmount(), returnedTransaction.getAmount()); //depricated for double <=> double
        //Трябва да използваме делта, по коята да сравни точността след десетичната запетая:
        Assert.assertEquals(transaction.getAmount(), returnedTransaction.getAmount(), 0.001);
        Assert.assertEquals(transaction.getFrom(), returnedTransaction.getFrom());
        Assert.assertEquals(transaction.getTo(), returnedTransaction.getTo());
    }

    //5.2 if the given ID is not existing
    @Test(expected = IllegalArgumentException.class)
    public void testGetByIdThrowInvalidId() {
        this.database.add(this.transactionList.get(0));
        this.database.getById(5);
    }

    //6.getByTransactionStatus
    //6.1 valid status -> returns transactions , sorted descending by amount
    @Test
    public void testGetByTransactionStatus() {
        List<Transaction> successfulTransactions = this.transactionList
                .stream()
                .filter(tr -> tr.getStatus() == TransactionStatus.SUCCESSFUL)
                .collect(Collectors.toList());
        fillDatabaseWithTransactions();

        Iterable<Transaction> transactions = this.database.getByTransactionStatus(TransactionStatus.SUCCESSFUL);
        List<Transaction> returnedTransactions = new ArrayList<>();
        transactions.forEach(returnedTransactions::add);

        Assert.assertEquals(successfulTransactions, returnedTransactions);
        returnedTransactions.forEach(tr -> Assert.assertEquals(TransactionStatus.SUCCESSFUL, tr.getStatus()));
    }

    //6.2 invalid status -> exception
    @Test(expected = IllegalArgumentException.class)
    public void testGetByTransactionStatusInvalidStatusShouldThrow() {
        fillDatabaseWithTransactions();

        this.database.getByTransactionStatus(TransactionStatus.UNAUTHORIZED);
    }

    //7. getAllSendersWithTransactionStatus(status) – returns all senders which have transactions with the given
    // status ordered by transactions amount (if there are multiple transactions with the same sender, return them all).
    // If no transactions exist, throw IllegalArgumentException.

    //7.1 Return all the senders with transactions with the given status in transactions amount order
    @Test
    public void testGetAllSendersWithTransactionStatus() {
        fillDatabaseWithTransactions();
        this.database.add(new TransactionImpl(4, TransactionStatus.SUCCESSFUL, "Desi", "Petar", 890));

        Iterable<String> result = this.database.getAllSendersWithTransactionStatus(TransactionStatus.SUCCESSFUL);
        List<String> returnedSenders = new ArrayList<>();
        result.forEach(returnedSenders::add);
        // returnedSenders -> {Desi, Petar, Petar}
        Assert.assertEquals(3, returnedSenders.size());
        Assert.assertEquals("Desi", returnedSenders.get(0));
        Assert.assertEquals("Petar", returnedSenders.get(1));
        Assert.assertEquals("Petar", returnedSenders.get(2));

    }
    //7.2 No such transactions with the given status -> IllegalArgumentException
    @Test (expected = IllegalArgumentException.class)
    public void testGetAllSendersWithTransactionInvalidStatusThrows() {
        fillDatabaseWithTransactions();
        this.database.getAllSendersWithTransactionStatus(TransactionStatus.UNAUTHORIZED);

    }

    //8.getAllReceiversWithTransactionStatus
    //8.1 return all receivers by the status
    @Test
    public void testGetAllReceiversWithTransactionStatus() {
        fillDatabaseWithTransactions();

        this.database.add(new TransactionImpl(4, TransactionStatus.SUCCESSFUL, "Desi", "Petar", 890));

        Iterable<String> result = this.database.getAllReceiversWithTransactionStatus(TransactionStatus.SUCCESSFUL);
        List<String> returnedReceivers = new ArrayList<>();
        result.forEach(returnedReceivers::add);
        // returnedSenders ->  {Petar, Maya, Maya}
        Assert.assertEquals(3, returnedReceivers.size());
        Assert.assertEquals("Petar", returnedReceivers.get(0));
        Assert.assertEquals("Maya", returnedReceivers.get(1));
        Assert.assertEquals("Maya", returnedReceivers.get(2));
    }

    //8.2 If no such transactions -> throw IllegalArgumentException
    @Test (expected = IllegalArgumentException.class)
    public void testGetAllReceiversWithTransactionInvalidStatusThrows() {
        fillDatabaseWithTransactions();
        this.database.getAllReceiversWithTransactionStatus(TransactionStatus.UNAUTHORIZED);

    }

    //9. getAllOrderedByAmountDescendingThenById() – returns all transactions ordered by amount descending and by id.
    @Test
    public void testGetAllOrderedByAmountDescendingThenById() {
        fillDatabaseWithTransactions();
        Iterable<Transaction> result = this.database.getAllOrderedByAmountDescendingThenById();
        List<Transaction> returned = new ArrayList<>();
        result.forEach(returned::add);
        List<Transaction> expected = this.transactionList
                .stream()
                .sorted(Comparator.comparing((Transaction::getAmount)).reversed()
                .thenComparing(Transaction::getId))
                .collect(Collectors.toList());

        Assert.assertEquals(expected, returned);

    }
    //10 getBySenderOrderedByAmountDescending
    @Test
    public void testGetBySenderOrderedByAmountDescending() {

    }



    //METHODS
    private void fillDatabaseWithTransactions() {
        this.database.add(this.transactionList.get(2));
        this.database.add(this.transactionList.get(1));
        this.database.add(this.transactionList.get(0));
    }
}