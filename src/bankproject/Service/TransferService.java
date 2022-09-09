package bankproject.Service;

import bankproject.entity.Account;

public class TransferService {
  public void transfer(Account accountFrom, Account accountTo, int amount){
      int billFromAmount = accountFrom.getBill().getAmount();
      int billToAmount = accountTo.getBill().getAmount();
      if (billFromAmount < amount){
          System.out.println("Перевод невозможен, не хватает средств");
      } else {
          accountFrom.getBill().setAmount(billFromAmount - amount);
          System.out.println("Текущее состояние счета " + accountFrom.getAccountHolder().getName() + " " + accountFrom.getAccountHolder().getSurName() + " - " + accountFrom.getBill().getAmount());
          accountTo.getBill().setAmount(billToAmount + amount);
          System.out.println("Текущще состояние счета " + accountTo.getAccountHolder().getName() + " " + accountTo.getAccountHolder().getSurName() + " - " + accountTo.getBill().getAmount());
      }
  }
}
