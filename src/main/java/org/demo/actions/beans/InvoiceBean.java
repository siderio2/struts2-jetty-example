package org.demo.actions.beans;

import java.util.Date;

public class InvoiceBean {

    private String subject;
    private Date dateFrom;
    private Date dateTo;
    private double price;

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(Date dateTo) { this.dateTo = dateTo; }

    public void setPrice(double price) { this.price = price; }

    public String getSubject() { return subject; }

    public Date getDateTo() {
        return dateTo;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public double getPrice() { return  price; }

    // método que calcula el total con IVA del 21% y lo entrega en forma de string con sólo dos decimales.
    public String getTotal() {
        double total = price * 1.21;
        return String.format("%.2f", total);
    }
}

