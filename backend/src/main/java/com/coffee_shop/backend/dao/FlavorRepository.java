package com.coffee_shop.backend.dao;

import com.coffee_shop.backend.Entities.Flavor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlavorRepository extends JpaRepository<Flavor, Long> {
}
