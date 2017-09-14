package com.theironyard.invoicify.controllers;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
import org.springframework.web.servlet.ModelAndView;

import com.theironyard.invoicify.models.BillingRecord;
import com.theironyard.invoicify.models.Company;
import com.theironyard.invoicify.repositories.BillingRecordRepository;
import com.theironyard.invoicify.repositories.CompanyRepository;

public class BillingRecordControllerTests {
	
	private BillingRecordController controller;
	private BillingRecordRepository recordRepo;
	private CompanyRepository companyRepo;
	
	@Before
	public void setup() {
		recordRepo = mock(BillingRecordRepository.class);
		companyRepo = mock(CompanyRepository.class);
		controller = new BillingRecordController(recordRepo, companyRepo);
	}

	@Test
	public void test_list() {
		List<BillingRecord> records = new ArrayList<BillingRecord>();
		List<Company> companyRecords = new ArrayList<Company>();
		when(recordRepo.findAll()).thenReturn(records);
		when(companyRepo.findAll()).thenReturn(companyRecords);
		
		ModelAndView actual = controller.list();
		
		verify(recordRepo).findAll();
		assertThat(actual.getViewName()).isEqualTo("billing-records/list");
		assertThat(actual.getModel().get("records")).isSameAs(records);
	}
	
}
