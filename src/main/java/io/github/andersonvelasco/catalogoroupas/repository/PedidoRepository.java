package io.github.andersonvelasco.catalogoroupas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.andersonvelasco.catalogoroupas.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    
}
