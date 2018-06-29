package org.fundaciobit.pluginsib.calculadora.calculadorafor.tests;

import org.fundaciobit.calculadora_plugin2.calculadora_plugin2.CalculadoraFor;
import org.fundaciobit.pluginsib.calculadora.api.ICalculadora;
import org.fundaciobit.pluginsib.calculadora.api.tests.TestCalculadoraBase;

public class TestCalculadoraFor extends TestCalculadoraBase{

  public TestCalculadoraFor(String testName) {
    super(testName);
  }

  @Override
  public ICalculadora getCalculadora() {
    CalculadoraFor tester = new CalculadoraFor();
    return tester;
  }

}
