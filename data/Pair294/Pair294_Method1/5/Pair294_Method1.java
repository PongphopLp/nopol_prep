import java.util.*;

public class Target {

int arrayCompare(byte[] x,byte[] y){
  int min=x.length < y.length ? x.length : y.length;
  for (int i=0; i < min; i++)   if (x[i] != y[i])   return x[i] - y[i];
  return x.length - y.length;
}
  int __target__(byte[] x,byte[] y){
  int min=x.length < y.length ? x.length : y.length;
  for (int i=0; i < min; i++)   if (x[i] == y[i])   return x[i] - y[i];
  return x.length - y.length;
}

}