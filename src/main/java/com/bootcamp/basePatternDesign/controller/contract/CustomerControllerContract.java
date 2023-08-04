package com.bootcamp.basePatternDesign.controller.contract;

import com.bootcamp.basePatternDesign.dto.CustomerDto;
import com.bootcamp.basePatternDesign.dto.CustomerSaveRequest;

import java.util.List;

public interface CustomerControllerContract {

    CustomerDto save(CustomerSaveRequest request);

    List<CustomerDto> findAll();

    void delete(Long id);
}
