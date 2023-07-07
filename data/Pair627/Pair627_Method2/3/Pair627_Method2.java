import java.util.*;

public class Target {

int min(int x,int y,int z){
  if ((x < y) && (x < z)) {
    return x;
  }
  if (y < z) {
    return y;
  }
  return z;
}
  int __target__(int x,int y,int z){
  if ((x < y) && (x < z)) {
    return x;
  }
  if (y >= z) {
    return y;
  }
  return z;
}

}