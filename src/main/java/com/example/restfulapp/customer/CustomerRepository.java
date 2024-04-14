package com.example.restfulapp.customer;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Component;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    @Query("SELECT c FROM customers c WHERE LOWER(c.city) = LOWER(:city)")
    List<Customer> findByCity(String city);

    @Query("SELECT 1 FROM customers WHERE id = (:id)")
    Optional<Customer> findById(String id);

//    @Query("")
}
