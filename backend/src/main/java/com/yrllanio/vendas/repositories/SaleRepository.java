package com.yrllanio.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yrllanio.vendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
