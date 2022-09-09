package bankproject.entity;

import bankproject.entity.Bill;

public class Payment {
    private Bill bill;

    public Payment(Bill bill) {
        this.bill = bill;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}

