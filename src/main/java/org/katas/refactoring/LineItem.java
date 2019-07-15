package org.katas.refactoring;

public class LineItem {
    private String desc;
    private double p;
    private int qty;

    public LineItem(String desc, double p, int qty) {
        super();
        this.desc = desc;
        this.p = p;
        this.qty = qty;
    }

    String getDescription() {
        return desc;
    }

    double getPrice() {
        return p;
    }

    int getQuantity() {
        return qty;
    }

    double totalAmount() {
        return p * qty;
    }
}