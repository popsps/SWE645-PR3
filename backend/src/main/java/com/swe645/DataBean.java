package com.swe645;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "student")
public class DataBean implements Serializable {
  //    two attributes to
  //    hold the mean and standard deviation
  @Column(name = "MEAN")
  private double mean;
  @Column(name = "STANDARD_DEVIATION")
  private double standardDeviation;
  @Id
  private String id;

  public DataBean() {
    this.mean = -1;
    this.standardDeviation = -1;
  }

  public DataBean(double mean, double standardDeviation) {
    this.mean = mean;
    this.standardDeviation = standardDeviation;
  }

  public double getMean() {
    return mean;
  }

  public void setMean(double mean) {
    this.mean = mean;
  }

  public double getStandardDeviation() {
    return standardDeviation;
  }

  public void setStandardDeviation(double standardDeviation) {
    this.standardDeviation = standardDeviation;
  }

}
