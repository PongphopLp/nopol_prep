import java.util.*;

public class Target {

int clamp(int n,int my,int child){
  if (my >= child || n < 0) {
    return 0;
  }
  if ((my + n) > child) {
    return child - my;
  }
  return n;
}
  int __target__(int n,int my,int child){
  if (my >= child || n < 0) {
    return 0;
  }
  if ((my + n) <= child) {
    return child - my;
  }
  return n;
}

}