package com.strrieve.spring_boot_content_negotiation_demo.model.dto;

public class User {

  private String name;
  private String organization;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }
}
