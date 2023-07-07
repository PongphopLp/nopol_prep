import java.util.*;

public class Target {

double aggregate(double[] values,int numValues){
  if (numValues == 0)   return 0;
  double total=0;
  for (int i=0; i < numValues; ++i)   total+=values[i];
  return total / numValues;
}
  double __target__(double[] values,int numValues){
  if (numValues == 0)   return 0;
  double total=0;
  for (int i=0; i < numValues; --i)   total+=values[i];
  return total / numValues;
}

}