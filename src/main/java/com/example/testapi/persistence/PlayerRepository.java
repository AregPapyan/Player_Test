package com.example.testapi.persistence;

import com.example.testapi.persistence.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player,Long> {
}
