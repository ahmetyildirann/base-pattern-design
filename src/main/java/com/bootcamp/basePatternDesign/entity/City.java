package com.bootcamp.basePatternDesign.entity;

import com.bootcamp.basePatternDesign.general.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class City extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;
}
