import java.util.*;

public class Target {

double max(double[] a){
  double b=a[0];
  for (int i=0; i < a.length; i++)   if (a[i] > b)   b=a[i];
  return b;
}
  double __target__(double[] a){
  double b=a[0];
  for (int i=0; i < a.length; i--)   if (a[i] > b)   b=a[i];
  return b;
}

}