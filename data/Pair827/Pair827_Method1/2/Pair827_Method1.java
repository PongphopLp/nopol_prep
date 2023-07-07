import java.util.*;

public class Target {

double of(double[] d,int numParam){
  double sum=0;
  for (int i=0; i < numParam; i++)   sum+=d[i];
  return sum;
}
  double __target__(double[] d,int numParam){
  double sum=0;
  for (int i=0; i <= numParam; i++)   sum+=d[i];
  return sum;
}

}