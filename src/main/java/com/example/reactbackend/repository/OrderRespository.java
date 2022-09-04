package com.example.reactbackend.repository;

import com.example.reactbackend.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRespository extends JpaRepository<CustomerOrder, Long> {

}
