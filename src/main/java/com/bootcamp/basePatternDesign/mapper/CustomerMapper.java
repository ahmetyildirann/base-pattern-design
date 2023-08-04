package com.bootcamp.basePatternDesign.mapper;

import com.bootcamp.basePatternDesign.dto.CustomerDto;
import com.bootcamp.basePatternDesign.dto.CustomerSaveRequest;
import com.bootcamp.basePatternDesign.entity.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

//    convertToeEntity
    Customer convertToCustomer(CustomerSaveRequest customerSaveRequest);

    CustomerDto convertToCustomerDto(Customer customer);

    List<CustomerDto> convertToCustomerDtoList(List<Customer> customerList);

}
