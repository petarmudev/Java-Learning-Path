package L22_ExerciseTestDrivenDevelopment.Chainblock;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChainblockImplTest {
    private Chainblock database;
    private List<Transaction> list; //list с примерни транзакции

    @Before
    public void setUp() {
        this.database = new ChainblockImpl();
        this.list = new ArrayList<>();
        prepareTransactions();
    }

    private void prepareTransactions() {
        Transaction transaction1 = new TransactionImpl(0, TransactionStatus.SUCCESSFUL, "Petar", "Maya", 150.5);
        Transaction transaction2 = new TransactionImpl(1, TransactionStatus.SUCCESSFUL, "Petar", "Maya", 120.5);
        Transaction transaction3 = new TransactionImpl(2, TransactionStatus.FAILED, "Petar", "Maya", 100.5);
        this.list.add(transaction1);//list с примерни транзакции
        this.list.add(transaction2);//list с примерни транзакции
        this.list.add(transaction3);//list с примерни транзакции
    }

    //1. add
    //1.1 transaction with unique ID
    @Test
    public void testAddCorrectTransaction() {
        Assert.assertEquals(0, this.database.getCount());
        // 0 transactions

        this.database.add(this.list.get(0));
        //1 transactions
        Assert.assertEquals(1, this.database.getCount());

    }

    //1.2 transaction with NON unique ID
    @Test
    public void testAddExistingTransactionID() {
        Assert.assertEquals(0, this.database.getCount());
        // 0 transactions

        this.database.add(this.list.get(0));
        //1 transactions
        Assert.assertEquals(1, this.database.getCount());

        this.database.add(this.list.get(0));
        //1 transactions
        Assert.assertEquals(1, this.database.getCount());

    }


    //2. contains
    //by Transaction and by ID
    @Test
    public void testContains() {
        Assert.assertFalse(this.database.contains(list.get(0)));
        Assert.assertFalse(this.database.contains(list.get(0).getId()));

        this.database.add(this.list.get(0));
        Assert.assertTrue(this.database.contains(list.get(0)));
        Assert.assertTrue(this.database.contains(list.get(0).getId()));
    }

    //3 changeTransactionStatus
    //3.1 find the transaction by the given ID
    @Test
    public void testChangeTransactionStatus() {
        this.database.add(this.list.get(0));

        this.database.changeTransactionStatus(0, TransactionStatus.ABORTED);
        Assert.assertEquals(TransactionStatus.ABORTED, this.list.get(0).getStatus());

    }

    //3.2 We don`t find the given ID
    @Test(expected = IllegalArgumentException.class)
    public void testChangeTransactionStatusWithInvalidID() {
        this.database.add(this.list.get(0));

        this.database.changeTransactionStatus(100, TransactionStatus.ABORTED);
    }

    //4 removeTransactionByID
    //4.1 successfully remove
    @Test
    public void testRemoveTransactionByID() {
        this.database.add(this.list.get(0));
        this.database.add(this.list.get(1));
        Assert.assertEquals(2, this.database.getCount());
        //2 transactions
        int idToTest = this.list.get(1).getId();

        this.database.removeTransactionById(idToTest);

        //1 transaction
        Assert.assertEquals(1, this.database.getCount());
        Assert.assertFalse(this.database.contains(idToTest));

    }

    //4.2 Unsuccessful remove because of not valid ID
    @Test(expected = IllegalArgumentException.class)
    public void testRemoveTransactionByNotValidIDShouldThrow() {
        this.database.add(this.list.get(0));
        this.database.removeTransactionById(5);
    }

    //5. getByID
    //5.1 if the ID exists
    @Test
    public void testGetByID() {
        Transaction transaction = this.list.get(0);
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
        this.database.add(this.list.get(0));
        this.database.getById(5);
    }

    //6.getByTransactionStatus
    //6.1 valid status -> returns transactions , sorted descending by amount
    @Test
    public void testGetByTransactionStatus() {
        List<Transaction> successfulTransactions = this.list
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
    @Test (expected = IllegalArgumentException.class)
    public void testGetByTransactionStatusInvalidStatusShouldThrow() {
        fillDatabaseWithTransactions();

        this.database.getByTransactionStatus(TransactionStatus.UNAUTHORIZED);
    }


    //METHODS
    private void fillDatabaseWithTransactions() {
        this.database.add(this.list.get(2));
        this.database.add(this.list.get(1));
        this.database.add(this.list.get(0));
    }
}