package com.seuprojeto.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.seuprojeto.ecommerce.model.Pedido;

//Permite salvar pedido, buscar pedido, detelar e atualizar, tudo isto automaticamente

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
