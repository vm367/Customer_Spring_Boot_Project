package com.vm.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.vm.customer.dal.entities.customer;

public interface customerrepository extends CrudRepository<customer, Long> {

}
