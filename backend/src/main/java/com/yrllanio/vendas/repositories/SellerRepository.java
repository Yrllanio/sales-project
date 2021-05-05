package com.yrllanio.vendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yrllanio.vendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
