import java.util.*;

public class Target {

int range(int n,int min,int max){
  if (n <= min)   return min;
  if (n >= max)   return max;
  return n;
}
  int __target__(int n,int min,int max){
  if (n > min)   return min;
  if (n >= max)   return max;
  return n;
}

}