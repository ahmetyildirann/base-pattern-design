package com.bootcamp.basePatternDesign.dto;

public record CustomerDto(Long id,
                          String name,
                          String surname,
                          String username,
                          String email,
                          String birthDate,
                          String status) {
}
