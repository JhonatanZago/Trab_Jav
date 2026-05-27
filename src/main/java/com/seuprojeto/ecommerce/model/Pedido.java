package com.seuprojeto.ecommerce.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Pedido {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private Double valor;
 private Double frete;
 private LocalDateTime dataCriacao;

 @Enumerated(EnumType.STRING)
 private StatusPedido status;

 private String tipoFrete;

 public Pedido(){}

 public Long getId(){return id;}
 public void setId(Long id){this.id=id;}

 public Double getValor(){return valor;}
 public void setValor(Double valor){this.valor=valor;}

 public Double getFrete(){return frete;}
 public void setFrete(Double frete){this.frete=frete;}

 public LocalDateTime getDataCriacao(){return dataCriacao;}
 public void setDataCriacao(LocalDateTime dataCriacao){this.dataCriacao=dataCriacao;}

 public StatusPedido getStatus(){return status;}
 public void setStatus(StatusPedido status){this.status=status;}

 public String getTipoFrete(){return tipoFrete;}
 public void setTipoFrete(String tipoFrete){this.tipoFrete=tipoFrete;}
}
