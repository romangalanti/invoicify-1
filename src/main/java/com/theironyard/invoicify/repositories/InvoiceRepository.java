package com.theironyard.invoicify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theironyard.invoicify.models.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
