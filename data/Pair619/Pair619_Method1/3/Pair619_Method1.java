import java.util.*;

public class Target {

int max(int i1,int i2,int i3){
  int max=i1;
  if (i2 > i1) {
    max=i2;
  }
  if (i3 > max) {
    max=i3;
  }
  return max;
}
  int __target__(int i1,int i2,int i3){
  int max=i1;
  if (i2 >= i1) {
    max=i2;
  }
  if (i3 > max) {
    max=i3;
  }
  return max;
}

}