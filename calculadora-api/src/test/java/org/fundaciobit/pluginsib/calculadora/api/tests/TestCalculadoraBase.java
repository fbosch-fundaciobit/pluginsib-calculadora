package org.fundaciobit.pluginsib.calculadora.api.tests;

import org.fundaciobit.pluginsib.calculadora.api.ICalculadora;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public abstract class TestCalculadoraBase extends TestCase {

  /**
   * Create the test case
   *
   * @param testName
   *          name of the test case
   */
  public TestCalculadoraBase(String testName) {
    super(testName);
  }

  /**
   * @return the suite of tests being tested
   */
  //public static Test suite() {
   // return new TestSuite(TestCalculadoraBase.class);
 // }

  /**
   * Rigourous Test :-)
   */

  public abstract ICalculadora getCalculadora();

  public void testCalculadora() {
    ICalculadora calc = getCalculadora();
    assertEquals(4, calc.suma(2, 2));
    assertEquals(6, calc.resta(8, 2));

  }

}
