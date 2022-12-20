package com.strrieve.spring_boot_content_negotiation_demo.controller;

import com.strrieve.spring_boot_content_negotiation_demo.model.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

  @GetMapping(value = "user",
      produces = {"application/json", "application/xml"})
  public ResponseEntity<User> getUser(
      @RequestParam("name") String userName,
      @RequestParam("organization") String organization
  ) {

    User user = new User();
    user.setName(userName);
    user.setOrganization(organization);

    ResponseEntity<User> entity = new ResponseEntity<>(user, HttpStatus.OK);
    return entity;

  }

}
