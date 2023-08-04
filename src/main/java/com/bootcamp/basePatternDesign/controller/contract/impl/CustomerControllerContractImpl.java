package com.bootcamp.basePatternDesign.controller.contract.impl;

import com.bootcamp.basePatternDesign.controller.contract.CustomerControllerContract;
import com.bootcamp.basePatternDesign.dto.CustomerDto;
import com.bootcamp.basePatternDesign.dto.CustomerSaveRequest;
import com.bootcamp.basePatternDesign.entity.Customer;
import com.bootcamp.basePatternDesign.entityservice.CustomerEntityService;
import com.bootcamp.basePatternDesign.mapper.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerControllerContractImpl implements CustomerControllerContract {

    private final CustomerEntityService customerEntityService;
    @Override
    public CustomerDto save(CustomerSaveRequest request) {

        Customer customer = CustomerMapper.INSTANCE.convertToCustomer(request);

        customer = customerEntityService.save(customer);

        CustomerDto customerDto = CustomerMapper.INSTANCE.convertToCustomerDto(customer);

        return customerDto;
    }

    @Override
    public List<CustomerDto> findAll() {
        List<Customer> customerList = customerEntityService.findAll();
        return CustomerMapper.INSTANCE.convertToCustomerDtoList(customerList);
    }

    @Override
    public void delete(Long id) {
        customerEntityService.delete(id);
    }
}
