package com.example.tbot_client_v2.repository;

import com.example.tbot_client_v2.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
