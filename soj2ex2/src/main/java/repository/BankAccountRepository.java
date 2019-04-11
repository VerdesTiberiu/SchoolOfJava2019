package repository;

import model.BankAccount;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BankAccountRepository {
    private List<BankAccount> bankAccountList = new ArrayList();

    public void insertBankAccount(BankAccount bankAccount){
        bankAccountList.add(bankAccount);
    }
    public ArrayList<BankAccount> getAllBankAccount(){
        return (ArrayList<BankAccount>)bankAccountList;
    }
    public BankAccount getBankAccount(String iban){
        for(BankAccount bankAccount: bankAccountList){
            if(bankAccount.getIban().equals(iban)){
                return bankAccount;
            }
        }
        return null; //cu toate ca nu e indicat
    }
}
