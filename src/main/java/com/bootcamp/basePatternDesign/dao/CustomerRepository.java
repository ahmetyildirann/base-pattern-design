package com.bootcamp.basePatternDesign.dao;

import com.bootcamp.basePatternDesign.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ahmet Yildiran on 03.08.2023.
 * TODO: Add a class header comment!
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {


}
