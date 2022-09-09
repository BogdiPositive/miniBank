package bankproject.Service;

import bankproject.entity.Account;
import bankproject.entity.Bill;

public class DepositService {
    public void deposit (Account account, int amount){
        Bill bill = account.getBill();
        int currentBillAmount = bill.getAmount();
        System.out.println("Операция пополнения счета, текущее значение счета: " + account.getAccountHolder().getName() + " " + account.getAccountHolder().getSurName() + " - " + currentBillAmount);
        bill.setAmount(currentBillAmount + amount);
        System.out.println("Операция выполнена, текущее значение счета: " + account.getAccountHolder().getName() + " " + account.getAccountHolder().getSurName() + " - " + bill.getAmount());
    }
}
