import java.util.*;

public class Target {

int getBreakOffset(int a,int b){
  if (a == -1) {
    return (b);
  }
 else   if (b == -1) {
    return (a);
  }
 else   if (a < b) {
    return (a);
  }
 else {
    return (b);
  }
}
  int __target__(int a,int b){
  if (a == -1) {
    return (b);
  }
 else   if (b == -1) {
    return (a);
  }
 else   if (a <= b) {
    return (a);
  }
 else {
    return (b);
  }
}

}