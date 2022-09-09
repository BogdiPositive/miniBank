package bankproject.Service;

import bankproject.entity.Account;
import bankproject.entity.Bill;

public class PaymentService {
    public void PayMethod(Account account, int amount){
        Bill bill = account.getBill();
        if (bill.getAmount() < amount){
            System.out.println("Платеж невозможен, недостаточно средств");
        } else {
            int currentBillAmount = bill.getAmount();
            System.out.println("Происходит операция платежа, текущее значение счета: " + account.getAccountHolder().getName() + " " + account.getAccountHolder().getSurName() + " - " + currentBillAmount);
            bill.setAmount(currentBillAmount - amount);
            System.out.println("Платеж совершен, текущее значение счета: " + account.getAccountHolder().getName() + " " + account.getAccountHolder().getSurName() + " - " + bill.getAmount());
        }
    }
}
