package org.katas.refactoring;

import java.util.List;

public class Order {
    private String nm;
    private String addr;
    private List<LineItem> li;

    public Order(String nm, String addr, List<LineItem> li) {
        this.nm = nm;
        this.addr = addr;
        this.li = li;
    }

    String getCustomerName() {
        return nm;
    }

    String getCustomerAddress() {
        return addr;
    }

    List<LineItem> getLineItems() {
        return li;
    }
}
