import java.util.*;

public class Target {

double aggregate(double[] values,int numValues){
  double total=0;
  for (int i=0; i < numValues; ++i)   total+=values[i];
  return total;
}
  double __target__(double[] values,int numValues){
  double total=0;
  for (int i=0; i >= numValues; ++i)   total+=values[i];
  return total;
}

}