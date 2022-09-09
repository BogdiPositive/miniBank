package bankproject;

import bankproject.Service.DepositService;
import bankproject.Service.TransferService;
import bankproject.entity.Account;
import bankproject.entity.Bill;
import bankproject.Service.PaymentService;
import bankproject.entity.Person;

public class Main {
    public static void main(String[] args) {
   Person Alex = new Person("Alex", "Brendon", "89013619094");
    Bill alexBill = new Bill(10000);
    Account alexAccount = new Account(Alex, alexBill);


    Person Marty = new Person("Marty", "Rudof", "+7901345634");
    Bill martyBill = new Bill(5000);
    Account martyAccount = new Account(Marty, martyBill);

     PaymentService newPay = new PaymentService();
     newPay.PayMethod(alexAccount, 1000);
     newPay.PayMethod(martyAccount, 1500);

     DepositService newDeposit = new DepositService();
     newDeposit.deposit(alexAccount, 5000);
     newDeposit.deposit(martyAccount, 2000);

     TransferService newTransfer = new TransferService();
     newTransfer.transfer(alexAccount, martyAccount,1000);
    }
}