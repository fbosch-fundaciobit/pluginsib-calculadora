package org.fundaciobit.pluginsib.calculadora.api;
import org.fundaciobit.plugins.IPlugin;


public interface ICalculadora extends IPlugin {

  int suma(int i, int j);
  int resta (int i, int j);

}
