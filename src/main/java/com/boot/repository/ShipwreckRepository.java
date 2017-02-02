package com.boot.repository;

import com.boot.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by oscar.castillo on 02/02/2017.
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck, Long> {
}
