import java.util.*;

public class Target {

int max(int a,int b,int c){
  if (a >= b && a >= c)   return a;
 else   if (b >= c && b >= a)   return b;
 else   return c;
}
  int __target__(int a,int b,int c){
  if (a >= b && a >= c)   return a;
 else   if (b > c && b >= a)   return b;
 else   return c;
}

}