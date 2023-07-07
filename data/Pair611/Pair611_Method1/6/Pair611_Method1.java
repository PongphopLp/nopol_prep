import java.util.*;

public class Target {

int getAv(int x2,int x1,int p){
  int d=x2 - x1;
  if (Math.abs(d) < p)   return x2;
  if (d < 0)   return x1 - p;
  if (d > 0)   return x1 + p;
  return x2;
}
  int __target__(int x2,int x1,int p){
  int d=x2 - x1;
  if (Math.abs(d) < p)   return x2;
  if (d < 0)   return x1 - p;
  if (d >= 0)   return x1 + p;
  return x2;
}

}