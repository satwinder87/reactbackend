package com.example.reactbackend.rest;

import com.example.reactbackend.model.CustomerOrder;
import com.example.reactbackend.service.OrderService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@Slf4j
@RestController
@RequestMapping(value = "api/v1")
public class OrderController {

  private OrderService service;

  @Autowired
  public OrderController(OrderService service) {
    this.service = service;
  }

  @PostMapping(value = "saveOrder")
  public ResponseEntity<CustomerOrder> saveOrder(@RequestBody CustomerOrder order) {
    log.info("Received Request to save a order, Order = " + order);
    return ResponseEntity.ok(service.saveOrder(order));
  }

  @GetMapping(value = "getAllOrders")
  public ResponseEntity<List<CustomerOrder>> getAllOrders() {
    log.info("Received Request to retrieve all orders ");
    return ResponseEntity.ok(service.getAllOrders());
  }

}
