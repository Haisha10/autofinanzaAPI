package com.upc.autofinanzaAPI.repositories;

import com.upc.autofinanzaAPI.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByLogin(String login);
}
