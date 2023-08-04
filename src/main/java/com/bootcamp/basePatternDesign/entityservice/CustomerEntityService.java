package com.bootcamp.basePatternDesign.entityservice;

import com.bootcamp.basePatternDesign.dao.CustomerRepository;
import com.bootcamp.basePatternDesign.entity.Customer;
import com.bootcamp.basePatternDesign.general.BaseEntityService;
import org.springframework.stereotype.Service;

/*
    * Created by Ahmet Yildiran on 03.08.2023.
 */
@Service
public class CustomerEntityService extends BaseEntityService<Customer, CustomerRepository> {

    public CustomerEntityService(CustomerRepository ropository) {
        super(ropository);
    }



//    private final CustomerRepository customerRepository;

//    public Customer save(Customer customer){
//        return customerRepository.save(customer);
//    }
//
//    public List<Customer> findAll() {
//        return customerRepository.findAll();
//    }
}
