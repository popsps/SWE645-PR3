package com.swe645;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "student")
public class StudentBean implements Serializable {
  //    com.swe642.StudentBean has attributes that matches most
  //    of the Student Survey Form fields, except the Data field

  @Id
  @Column(name = "id", unique = true)
  private int studentID;
  @Column(name = "firstname", nullable = false)
  private String fName;
  @Column(name = "lastname", nullable = false)
  private String lName;
  @Column(name = "street")
  private String street;
  @Column(name = "zipcode")
  private int zipcode;
  @Column(name = "city")
  private String city;
  @Column(name = "state")
  private String state;
  @Column(name = "phone")
  private String phone;
  @Column(name = "email")
  private String email;
  @Column(name = "visited_at")
  private Timestamp visitedAt;
  @Column(name = "fdate")
  private String fDate;

  public StudentBean(int studentID, String fName, String lName, String street, int zipcode, String city, String state, String phone, String email, Timestamp visitedAt) {
    this.studentID = studentID;
    this.fName = fName;
    this.lName = lName;
    this.street = street;
    this.zipcode = zipcode;
    this.city = city;
    this.state = state;
    this.phone = phone;
    this.email = email;
    this.visitedAt = visitedAt;
  }

  public StudentBean(int studentID, String fName, String lName, String street, int zipcode, String city, String state, String phone, String email) {
    this.studentID = studentID;
    this.fName = fName;
    this.lName = lName;
    this.street = street;
    this.zipcode = zipcode;
    this.city = city;
    this.state = state;
    this.phone = phone;
    this.email = email;
    this.visitedAt = null;
  }

  public StudentBean(int studentID, String fName, String lName, String street, int zipcode, String city, String state, String phone, String email, String fDate, Timestamp visitedAt) {
    this.studentID = studentID;
    this.fName = fName;
    this.lName = lName;
    this.street = street;
    this.zipcode = zipcode;
    this.city = city;
    this.state = state;
    this.phone = phone;
    this.email = email;
    this.fDate = fDate;
    this.visitedAt = visitedAt;
  }

  public StudentBean() {
    this.studentID = 0;
    this.fName = "";
    this.lName = "";
    this.street = "";
    this.zipcode = 0;
    this.city = "";
    this.state = "";
    this.phone = "";
    this.email = "";
    this.fDate = "";
  }

  public void clone(StudentBean newStudent) {
    this.studentID = newStudent.getStudentID();
    this.fName = newStudent.getfName();
    this.lName = newStudent.getlName();
    this.street = newStudent.getStreet();
    this.zipcode = newStudent.getZipcode();
    this.city = newStudent.getCity();
    this.state = newStudent.getState();
    this.phone = newStudent.getPhone();
    this.email = newStudent.getEmail();
    this.visitedAt = newStudent.getVisitedAt();
  }

  public int getStudentID() {
    return studentID;
  }

  public void setStudentID(int studentID) {
    this.studentID = studentID;
  }

  public String getfName() {
    return fName;
  }

  public void setfName(String fName) {
    this.fName = fName;
  }

  public String getlName() {
    return lName;
  }

  public void setlName(String lName) {
    this.lName = lName;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public int getZipcode() {
    return zipcode;
  }

  public void setZipcode(int zipCode) {
    this.zipcode = zipCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Timestamp getVisitedAt() {
    return visitedAt;
  }

  public void setVisitedAt(Timestamp visitedAt) {
    this.visitedAt = visitedAt;
  }

  public String getFDate() {
    return fDate;
  }

  public void setFDate(String fDate) {
    this.fDate = fDate;
  }
}
