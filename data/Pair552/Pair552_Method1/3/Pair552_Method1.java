import java.util.*;

public class Target {

int mod(int a,int b){
  int n=a / b;
  int result=a - n * b;
  if (result < 0)   return result + b;
  return result;
}
  int __target__(int a,int b){
  int n=a / b;
  int result=a - n / b;
  if (result < 0)   return result + b;
  return result;
}

}