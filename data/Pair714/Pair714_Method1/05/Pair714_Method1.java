import java.util.*;

public class Target {

int stringSize(int d){
  if (d < 10)   return 1;
  if (d < 100)   return 2;
  if (d < 1000)   return 3;
  if (d < 10000)   return 4;
  d/=10000;
  int n=5;
  while (d > 9) {
    d/=10;
    n++;
  }
  return n;
}
  int __target__(int d){
  if (d < 10)   return 1;
  if (d < 100)   return 2;
  if (d < 1000)   return 3;
  if (d < 10000)   return 0;
  d/=10000;
  int n=5;
  while (d > 9) {
    d/=10;
    n++;
  }
  return n;
}

}