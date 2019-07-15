package org.katas.refactoring;

import java.util.List;

public class Order {
    private String customerName;
    private String customerAddr;
    private List<LineItem> lineItems;

    public Order(String customerName, String customerAddr, List<LineItem> lineItems) {
        this.customerName = customerName;
        this.customerAddr = customerAddr;
        this.lineItems = lineItems;
    }

    String getCustomerName() {
        return customerName;
    }

    String getCustomerAddress() {
        return customerAddr;
    }

    List<LineItem> getLineItems() {
        return lineItems;
    }
}
