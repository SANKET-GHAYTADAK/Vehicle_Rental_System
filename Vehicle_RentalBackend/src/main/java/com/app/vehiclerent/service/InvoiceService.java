package com.app.vehiclerent.service;

import java.util.List;

import com.app.vehiclerent.entity.Invoice;

public interface InvoiceService {
    List<Invoice> getAllInvoices();

    Invoice getInvoiceById(Long id);

    Invoice createInvoice(Invoice invoice);

    Invoice updateInvoice(Long id, Invoice invoice);

    void deleteInvoice(Long id);
}
