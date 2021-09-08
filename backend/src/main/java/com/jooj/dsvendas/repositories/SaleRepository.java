package com.jooj.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jooj.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
