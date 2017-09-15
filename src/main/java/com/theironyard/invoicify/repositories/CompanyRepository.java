package com.theironyard.invoicify.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.theironyard.invoicify.models.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
	
}
