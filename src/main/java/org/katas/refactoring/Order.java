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

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddr;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }
}
