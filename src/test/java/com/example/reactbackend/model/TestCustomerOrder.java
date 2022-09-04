package com.example.reactbackend.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class TestCustomerOrder {

  @Test
  public void testOrderAsJson() {
    /*
    Order order = Order.builder()
        .user(UserInfo.builder().name("satwinder").street("xyz").city("stockholm").postalCode("16270").build())
        .items(List.of(OrderItem.builder().id(1L).name("sushi").amount(2).price(22.2).build(),
            OrderItem.builder().id(2L).name("burger").amount(1).price(12.2).build())).build();

     */

    CustomerOrder order = CustomerOrder.builder()
        .build();

    ObjectMapper objectMapper = new ObjectMapper();

    try {
      System.out.println(objectMapper.writeValueAsString(order));
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }

  }

}
