import java.util.*;

public class Target {

double minimumValue(double[] arrFunc){
  double dblMin=arrFunc[0];
  for (int index=0; index < arrFunc.length; index++)   if (arrFunc[index] < dblMin) {
    dblMin=arrFunc[index];
  }
  return dblMin;
}
  double __target__(double[] arrFunc){
  double dblMin=arrFunc[0];
  for (int index=0; index < arrFunc.length; index++)   if (arrFunc[index] <= dblMin) {
    dblMin=arrFunc[index];
  }
  return dblMin;
}

}