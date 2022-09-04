package com.example.reactbackend.service;

import com.example.reactbackend.model.CustomerOrder;
import com.example.reactbackend.repository.OrderRespository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

  private final OrderRespository orderRespository;

  @Autowired
  public OrderService(OrderRespository orderRespository) {
    this.orderRespository = orderRespository;
  }

  public List<CustomerOrder> getAllOrders() {
    return orderRespository.findAll();
  }

  public CustomerOrder saveOrder(CustomerOrder order) {
    return orderRespository.save(order);
  }

}
