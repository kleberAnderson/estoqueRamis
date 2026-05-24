package io.github.andersonvelasco.catalogoroupas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import io.github.andersonvelasco.catalogoroupas.model.Modelo;

public interface ModeloRepository extends JpaRepository<Modelo, Long> {

    @Query("SELECT m FROM Modelo m WHERE m.nome = :nome")
    Modelo findModeloByNome(@Param("nome") String nome);

}
