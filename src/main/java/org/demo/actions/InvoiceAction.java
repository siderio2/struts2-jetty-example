package org.demo.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.demo.actions.beans.InvoiceBean;

public class InvoiceAction extends ActionSupport  {

    InvoiceBean invoiceBean;

    @Override
    public String execute() throws Exception {
        System.out.println("execute!!");
        return SUCCESS;
    }

    public InvoiceBean getInvoiceBean() {
        return invoiceBean;
    }

    public void setInvoiceBean(InvoiceBean invoiceBean) {
        this.invoiceBean = invoiceBean;
    }
    @Override
    public void validate() {
        if (invoiceBean.getSubject().isEmpty()) {
            addFieldError("invoiceBean.subject", getText("error.subject"));
        }
        // dateFrom required
        if (invoiceBean.getDateFrom() == null) {
            addFieldError("invoiceBean.dateFrom", getText("error.dateFrom"));
        }
        // dateTo required
        if (invoiceBean.getDateTo() == null) {
            addFieldError("invoiceBean.dateTo", getText("error.dateTo.required"));
        }
        // dateTo >= dateFrom
        if (invoiceBean.getDateFrom() != null && invoiceBean.getDateTo() != null &&  invoiceBean.getDateTo().before(invoiceBean.getDateFrom())) {
            addFieldError("invoiceBean.dateTo", getText("error.dateTo.before"));
        }
        // price required
        if (invoiceBean.getPrice() == 0) {
            addFieldError("invoiceBean.price", getText("error.price.required"));
        }
        // price número positivo
        if (invoiceBean.getPrice() < 0) {
            addFieldError("invoiceBean.price", getText("error.price.negative"));
        }
    }
}
