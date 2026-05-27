package com.seuprojeto.ecommerce.model.frete;

import org.springframework.stereotype.Component;

@Component
public class FreteAereo implements FreteStrategy {
 public double calcular(double valor){
  return valor * 0.10;
 }
}
