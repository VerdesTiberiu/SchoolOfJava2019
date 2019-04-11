package repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public void setTransactionRepository(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public TransactionRepository getTransactionRepository() {
        return transactionRepository;
    }

    @Override
    public String toString() {
        return "TransactionService{" +
                "transactionRepository=" + transactionRepository +
                '}';
    }
}

