package L22_ExerciseTestDrivenDevelopment.Chainblock;

import java.util.*;

public class ChainblockImpl implements Chainblock {

    private Map<Integer, Transaction> transactionMap;

    public ChainblockImpl() {
        this.transactionMap = new HashMap<>();
    }

    public int getCount() {
        return this.transactionMap.size();
    }

    public void add(Transaction transaction) {
        int id = transaction.getId();
        if (!this.transactionMap.containsKey(id)) {
            this.transactionMap.put(id, transaction);
        }

    }

    public boolean contains(Transaction transaction) {
        return this.transactionMap.containsValue(transaction);
    }

    public boolean contains(int id) {
        return this.transactionMap.containsKey(id);

    }

    public void changeTransactionStatus(int id, TransactionStatus newStatus) {
        //1. We do NOT have the given ID
        if (!transactionMap.containsKey(id)) {
            throw new IllegalArgumentException();
        }

        //2. We have the given ID transaction
        Transaction transactionForEdit = this.transactionMap.get(id);
        transactionForEdit.setStatus(newStatus);
    }

    public void removeTransactionById(int id) {
        //1. Invalid ID
        if (!this.transactionMap.containsKey(id)) {
            throw new IllegalArgumentException();
        }
        //2. ID found
        this.transactionMap.remove(id);
    }

    public Transaction getById(int id) {
        //1. no such ID
        if (!this.transactionMap.containsKey(id)) {
            throw new IllegalArgumentException();
        }
        //2. ID found
        return this.transactionMap.get(id);

    }

    public Iterable<Transaction> getByTransactionStatus(TransactionStatus status) {
        List<Transaction> filteredTransactions = new ArrayList<>();

        for (Transaction transaction : this.transactionMap.values()) {
            if (transaction.getStatus() == status) {
                filteredTransactions.add(transaction);
            }
        }
        if (filteredTransactions.size() == 0) {
            throw new IllegalArgumentException();
        }
        filteredTransactions.sort(Comparator.comparing(Transaction::getAmount).reversed());
        return filteredTransactions;
    }

    public Iterable<String> getAllSendersWithTransactionStatus(TransactionStatus status) {
        return null;
    }

    public Iterable<String> getAllReceiversWithTransactionStatus(TransactionStatus status) {
        return null;
    }

    public Iterable<Transaction> getAllOrderedByAmountDescendingThenById() {
        return null;
    }

    public Iterable<Transaction> getBySenderOrderedByAmountDescending(String sender) {
        return null;
    }

    public Iterable<Transaction> getByReceiverOrderedByAmountThenById(String receiver) {
        return null;
    }

    public Iterable<Transaction> getByTransactionStatusAndMaximumAmount(TransactionStatus status, double amount) {
        return null;
    }

    public Iterable<Transaction> getBySenderAndMinimumAmountDescending(String sender, double amount) {
        return null;
    }

    public Iterable<Transaction> getByReceiverAndAmountRange(String receiver, double lo, double hi) {
        return null;
    }

    public Iterable<Transaction> getAllInAmountRange(double lo, double hi) {
        return null;
    }

    public Iterator<Transaction> iterator() {
        return null;
    }
}
