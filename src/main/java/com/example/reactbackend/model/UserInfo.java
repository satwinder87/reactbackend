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
@Table(name = "USER_INFO")
public class UserInfo {

  @JsonIgnore
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "user_info_id")
  private Long userInfoId;

  @Column(name = "name")
  private String name;
  @Column(name = "street")
  private String street;
  @Column(name = "city")
  private String city;
  @Column(name = "postal_code")
  private String postalCode;
}
