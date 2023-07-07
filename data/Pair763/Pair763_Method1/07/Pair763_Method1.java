import java.util.*;

public class Target {

int minPositive(int a,int b){
  if (a >= 0 && b >= 0) {
    return (a < b) ? a : b;
  }
 else   if (a >= 0) {
    return a;
  }
 else   if (b >= 0) {
    return b;
  }
 else {
    return -1;
  }
}
  int __target__(int a,int b){
  if (a >= 0 && b < 0) {
    return (a < b) ? a : b;
  }
 else   if (a >= 0) {
    return a;
  }
 else   if (b >= 0) {
    return b;
  }
 else {
    return -1;
  }
}

}