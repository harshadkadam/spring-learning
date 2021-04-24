package com.harshadkadam.springlearning.service.impl;

import com.harshadkadam.springlearning.service.UtilityService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilityServiceImplTest {

  @Test
  public void calculateSum_basic() {
    final UtilityService utilityService = new UtilityServiceImpl();

    int actualResult = utilityService.calculateSum(new int[] {1, 2, 3});
    int expectedResult = 6;

    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void calculateSum_empty() {
    final UtilityService utilityService = new UtilityServiceImpl();

    int actualResult = utilityService.calculateSum(new int[] {});
    int expectedResult = 0;

    assertEquals(expectedResult, actualResult);
  }

  @Test
  public void calculateSum_oneValue() {
    final UtilityService utilityService = new UtilityServiceImpl();

    int actualResult = utilityService.calculateSum(new int[] {6});
    int expectedResult = 6;

    assertEquals(expectedResult, actualResult);
  }
}
