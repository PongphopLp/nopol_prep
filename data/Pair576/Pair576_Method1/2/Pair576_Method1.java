import java.util.*;

public class Target {

float multYSuma(float[] fila,float[] columna){
  float result=0;
  for (int i=0; i < fila.length; i++) {
    result+=fila[i] * columna[i];
  }
  return result;
}
  float __target__(float[] fila,float[] columna){
  float result=0;
  for (int i=0; i < fila.length; i--) {
    result+=fila[i] * columna[i];
  }
  return result;
}

}