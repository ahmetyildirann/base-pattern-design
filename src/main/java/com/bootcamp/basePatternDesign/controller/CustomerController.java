package com.bootcamp.basePatternDesign.controller;

import com.bootcamp.basePatternDesign.controller.contract.CustomerControllerContract;
import com.bootcamp.basePatternDesign.dto.CustomerDto;
import com.bootcamp.basePatternDesign.dto.CustomerSaveRequest;
import com.bootcamp.basePatternDesign.general.RestResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customers")
@RequiredArgsConstructor
public class CustomerController {

//    private final CustomerEntityService customerEntityService;
    private final CustomerControllerContract customerControllerContract;

    @PostMapping
    public ResponseEntity<RestResponse<CustomerDto>> save(@RequestBody CustomerSaveRequest customerSaveRequest){
        CustomerDto customerDto = customerControllerContract.save(customerSaveRequest);
        return ResponseEntity.ok(RestResponse.of(customerDto));
    }

    @GetMapping()
    public ResponseEntity<RestResponse<List<CustomerDto>>> findAll(){
        List<CustomerDto> customerDtoList = customerControllerContract.findAll();

        return  ResponseEntity.ok(RestResponse.of(customerDtoList));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<RestResponse<Object>> delete(@PathVariable Long id){
        customerControllerContract.delete(id);
        return ResponseEntity.ok(RestResponse.empty());
    }
}
