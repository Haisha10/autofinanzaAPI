package com.upc.autofinanzaAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.upc.autofinanzaAPI.entites.Data;

import java.util.Optional;

public interface DataRepository extends JpaRepository<Data, Long> {
    Optional<Data> findByUserId(Long userId);
}
