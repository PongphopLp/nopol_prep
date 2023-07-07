import java.util.*;

public class Target {

double maximumValue(double[] arrFunc){
  double dblMax=arrFunc[0];
  for (int index=0; index < arrFunc.length; index++)   if (arrFunc[index] > dblMax) {
    dblMax=arrFunc[index];
  }
  return dblMax;
}
  double __target__(double[] arrFunc){
  double dblMax=arrFunc[0];
  for (int index=0; index < arrFunc.length; index++)   if (arrFunc[index] <= dblMax) {
    dblMax=arrFunc[index];
  }
  return dblMax;
}

}