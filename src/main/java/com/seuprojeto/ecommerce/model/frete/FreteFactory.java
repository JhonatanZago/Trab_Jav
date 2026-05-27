package com.seuprojeto.ecommerce.model.frete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



//Este Factory serve para decidir qual frete usar, e evita "if" espalhado no código

@Component
public class FreteFactory {

 @Autowired
 private FreteTerrestre terrestre;

 @Autowired
 private FreteAereo aereo;

 public FreteStrategy getStrategy(String tipo){
  if(tipo.equalsIgnoreCase("TERRESTRE")) return terrestre;
  if(tipo.equalsIgnoreCase("AEREO")) return aereo;
  throw new RuntimeException("Tipo inválido");
 }
}
