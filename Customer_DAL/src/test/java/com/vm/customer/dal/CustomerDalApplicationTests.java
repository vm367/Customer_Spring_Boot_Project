package com.vm.customer.dal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.vm.customer.dal.repos.customerrepository;
import com.vm.customer.dal.entities.customer;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerDalApplicationTests {
	
	@Autowired
	private customerrepository customerrepository;
	
	
	@Test
	public void testCreateCustomer() {
		customer customer = new customer();
		
		customer.setCustName("Viswanath");
		customer.setCustEmail("vm@gmail.com");
		
		
		customerrepository.save(customer);
	}
	

}
