import java.util.*;

public class Target {

int max(int[] values){
  int largestvalue=values[0];
  for (int i=1; i < values.length; i++)   if (values[i] > largestvalue)   largestvalue=values[i];
  return largestvalue;
}
  int __target__(int[] values){
  int largestvalue=values[0];
  for (int i=1; i >= values.length; i++)   if (values[i] > largestvalue)   largestvalue=values[i];
  return largestvalue;
}

}