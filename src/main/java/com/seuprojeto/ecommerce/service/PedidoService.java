package com.seuprojeto.ecommerce.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.seuprojeto.ecommerce.model.*;
import com.seuprojeto.ecommerce.repository.*;
import com.seuprojeto.ecommerce.model.frete.*;

import java.time.LocalDateTime;


//Aqui é onde recebe o pedido, descobre o tipo do frete, usa a Factory,
// aplica a Strategy, calcula o frete e salva no banco


@Service
public class PedidoService {

 @Autowired
 private PedidoRepository repository;

 @Autowired
 private FreteFactory freteFactory;

 public Pedido criar(Pedido pedido){
  pedido.setStatus(StatusPedido.AGUARDANDO_PAGAMENTO);
  pedido.setDataCriacao(LocalDateTime.now());

  FreteStrategy strategy = freteFactory.getStrategy(pedido.getTipoFrete());
  pedido.setFrete(strategy.calcular(pedido.getValor()));

  return repository.save(pedido);
 }

 public Pedido pagar(Long id){
  Pedido p = buscar(id);
  if(p.getStatus() != StatusPedido.AGUARDANDO_PAGAMENTO)
   throw new RuntimeException("Não pode pagar");

  p.setStatus(StatusPedido.PAGO);
  return repository.save(p);
 }

 public Pedido enviar(Long id){
  Pedido p = buscar(id);
  if(p.getStatus() != StatusPedido.PAGO)
   throw new RuntimeException("Precisa estar pago");

  p.setStatus(StatusPedido.ENVIADO);
  return repository.save(p);
 }

 public Pedido cancelar(Long id){
  Pedido p = buscar(id);
  if(p.getStatus() == StatusPedido.PAGO || p.getStatus() == StatusPedido.ENVIADO)
   throw new RuntimeException("Não pode cancelar");

  p.setStatus(StatusPedido.CANCELADO);
  return repository.save(p);
 }

 public Pedido buscar(Long id){
  return repository.findById(id)
   .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
 }
}
