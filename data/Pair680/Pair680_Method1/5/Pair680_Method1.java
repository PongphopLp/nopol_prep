import java.util.*;

public class Target {

boolean isEquals(String valor1,String valor2){
  boolean igual=false;
  if ((valor1 == null && valor2 == null) || (valor1 == null && valor2 != null && valor2.equals("")) || (valor2 == null && valor1 != null && valor1.equals(""))) {
    igual=true;
  }
  if (valor1 != null && valor2 != null && valor1.equals(valor2)) {
    igual=true;
  }
  return igual;
}
  boolean __target__(String valor1,String valor2){
  boolean igual=false;
  if ((valor1 == null && valor2 == null) || (valor1 == null && valor2 != null && valor2.equals("")) || (valor2 != null && valor1 != null && valor1.equals(""))) {
    igual=true;
  }
  if (valor1 != null && valor2 != null && valor1.equals(valor2)) {
    igual=true;
  }
  return igual;
}

}