package com.example.PatronesKube.bd.jpa;

import com.example.PatronesKube.bd.orm.NombreORM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NombreJPA  extends JpaRepository<NombreORM, Long>{}
