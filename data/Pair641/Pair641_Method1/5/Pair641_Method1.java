import java.util.*;

public class Target {

int min(int a,int b,int c){
  if (a <= b && a <= c)   return a;
 else   if (b <= c && b <= a)   return b;
 else   return c;
}
  int __target__(int a,int b,int c){
  if (a > b && a <= c)   return a;
 else   if (b <= c && b <= a)   return b;
 else   return c;
}

}