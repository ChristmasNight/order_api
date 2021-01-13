package com.example.order;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/orders")
public class OrderController {

  @GetMapping("")
  public String test() {
    return "hello";
  }

//  @PostMapping("")
//  public ResponseEntity<?> createOrder() {
//
//  }
}