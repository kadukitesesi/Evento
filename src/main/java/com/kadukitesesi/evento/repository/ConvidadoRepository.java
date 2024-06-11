package com.kadukitesesi.evento.repository;

import com.kadukitesesi.evento.model.ConvidadosModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConvidadoRepository extends JpaRepository<ConvidadosModel,Long> {
}
