package org.fundaciobit.calculadora_plugin2.calculadora_plugin2;

import org.fundaciobit.pluginsib.calculadora.api.ICalculadora;

public class CalculadoraFor implements ICalculadora {

  public int suma(int i, int j) {
    int r = i;
    for (int n = 0; n < j; n++) {
      r++;
    }
    return r;
  }

  public int resta(int i, int j) {
    int r = i;
    for (int n = 0; n < j; n++) {
      r--;
    }
    return r;
  }
}
