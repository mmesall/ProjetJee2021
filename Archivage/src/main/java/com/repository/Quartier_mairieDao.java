package com.repository;


import com.entity.Quartier_mairie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Quartier_mairieDao  extends JpaRepository <Quartier_mairie,Long> {
}
