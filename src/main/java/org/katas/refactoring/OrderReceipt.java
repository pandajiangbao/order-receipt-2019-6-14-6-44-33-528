package org.katas.refactoring;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part
 * of order. It computes the total order amount (amount of individual lineItems +
 * total sales tax) and prints it.
 */
public class OrderReceipt {
    private static final double TAX_TATE = .10;
    private static double TOT_SALES_TX = 0d;
    private static double TOT = 0d;

    private Order o;

    public OrderReceipt(Order o) {
        this.o = o;
    }

    public String printReceipt() {
        StringBuilder output = new StringBuilder();
        getHeadersInfo(output);
        getLineItems(output);
        getTotalInfo(output);
        return output.toString();
    }

    private void getHeadersInfo(StringBuilder output) {
        output.append("======Printing Orders======\n");
        output.append(o.getCustomerName());
        output.append(o.getCustomerAddress());
    }

    private void getLineItems(StringBuilder output) {
        for (LineItem lineItem : o.getLineItems()) {
            output.append(lineItem.getDescription());
            output.append('\t');
            output.append(lineItem.getPrice());
            output.append('\t');
            output.append(lineItem.getQuantity());
            output.append('\t');
            output.append(lineItem.totalAmount());
            output.append('\n');
            calculateSalesTax(lineItem);
        }
    }

    private void calculateSalesTax(LineItem lineItem) {
        double salesTax = lineItem.totalAmount() * TAX_TATE;
        TOT_SALES_TX += salesTax;
        TOT += lineItem.totalAmount() + salesTax;
    }

    private void getTotalInfo(StringBuilder output) {
        output.append("Sales Tax").append('\t').append(TOT_SALES_TX);
        output.append("Total Amount").append('\t').append(TOT);
    }
}