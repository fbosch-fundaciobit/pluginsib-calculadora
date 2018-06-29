package org.fundaciobit.calculadora_plugin1.calculadora_plugin1;

import org.fundaciobit.pluginsib.calculadora.api.ICalculadora;

public class CalculadoraNormal implements ICalculadora{

  public int suma(int i, int j) {   
    return i+j;
  }

  public int resta(int i, int j) {    
    return i-j;
  }

}
