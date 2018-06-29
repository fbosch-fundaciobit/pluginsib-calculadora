package org.fundaciobit.pluginsib.calculadora.normal.tests;

import org.fundaciobit.calculadora_plugin1.calculadora_plugin1.CalculadoraNormal;
import org.fundaciobit.pluginsib.calculadora.api.ICalculadora;
import org.fundaciobit.pluginsib.calculadora.api.tests.TestCalculadoraBase;

public class TestCalculadoraNormal extends TestCalculadoraBase{

  public TestCalculadoraNormal(String testName) {
    super(testName);
  }

  @Override
  public ICalculadora getCalculadora() {
    CalculadoraNormal tester = new CalculadoraNormal();
    return tester;
  }

}
