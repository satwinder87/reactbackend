package com.example.reactbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ORDER_ITEM")
public class OrderItem {

  @JsonIgnore
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "order_item_id")
  private Long orderItemId;

  @Column(name = "id")
  private String id;
  @Column(name = "name")
  private String name;
  @Column(name = "amount")
  private Integer amount;
  @Column(name = "price")
  private Double price;

}
