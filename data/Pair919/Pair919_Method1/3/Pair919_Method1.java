import java.util.*;

public class Target {

int sum(int[] elements,int start,int length){
  int sum=0;
  for (int j=0; j < length; j++)   sum+=elements[start + j];
  return sum;
}
  int __target__(int[] elements,int start,int length){
  int sum=0;
  for (int j=0; j < length; j++)   sum+=elements[start - j];
  return sum;
}

}