package com.seuprojeto.ecommerce.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.seuprojeto.ecommerce.service.PedidoService;
import com.seuprojeto.ecommerce.model.Pedido;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

 @Autowired
 private PedidoService service;

 @PostMapping
 public Pedido criar(@RequestBody Pedido p){
  return service.criar(p);
 }

 @PostMapping("/{id}/pagar")
 public Pedido pagar(@PathVariable Long id){
  return service.pagar(id);
 }

 @PostMapping("/{id}/enviar")
 public Pedido enviar(@PathVariable Long id){
  return service.enviar(id);
 }

 @PostMapping("/{id}/cancelar")
 public Pedido cancelar(@PathVariable Long id){
  return service.cancelar(id);
 }

 @GetMapping("/{id}")
 public Pedido buscar(@PathVariable Long id){
  return service.buscar(id);
 }
}
