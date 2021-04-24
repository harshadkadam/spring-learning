package com.harshadkadam.springlearning.service.impl;

import com.harshadkadam.springlearning.service.UtilityService;

public class UtilityServiceImpl implements UtilityService {

  @Override
  public int calculateSum(int[] numbers) {

    int sum = 0;
    for (int value : numbers) {
      sum += value;
    }
    return sum;
  }
}
