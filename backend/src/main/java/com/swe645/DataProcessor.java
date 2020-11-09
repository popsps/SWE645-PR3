package com.swe645;

public class DataProcessor {
  // a method to compute the
  //Mean and Standard Deviation using the ten numbers entered in the Data field on the
  //Student Survey Form

  public static double computeMean(int[] numbers) {
    double mean = 0;
    for (int i = 0; i < numbers.length; i++) {
      mean += numbers[i];
    }
    return (double) mean / numbers.length;
  }

  public static double computeStandardDeviation(int[] numbers) {
    double mean = computeMean(numbers);
    double sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += Math.abs(numbers[i] - mean);
    }
    double sd = Math.sqrt((double) sum / numbers.length);
    return sd;
  }

}
