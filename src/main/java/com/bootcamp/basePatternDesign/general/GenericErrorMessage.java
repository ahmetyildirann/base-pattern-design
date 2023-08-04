package com.bootcamp.basePatternDesign.general;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author bahadirmemis
 */
@Data
@AllArgsConstructor
public class GenericErrorMessage {

  private LocalDateTime errorDate;
  private String message;
  private String detail;
}
