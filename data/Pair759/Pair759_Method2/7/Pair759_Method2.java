import java.util.*;

public class Target {

int addOver(int a,int b){
  int s=a + b;
  if (b >= 0)   return s >= a ? s : Integer.MAX_VALUE;
  return s < a ? s : Integer.MIN_VALUE;
}
  int __target__(int a,int b){
  int s=a + b;
  if (b >= 0)   return s >= a ? s : Integer.MAX_VALUE;
  return s >= a ? s : Integer.MIN_VALUE;
}

}