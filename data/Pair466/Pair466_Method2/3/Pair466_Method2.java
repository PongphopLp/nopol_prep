import java.util.*;

public class Target {

int mod(int x,int n){
  int y=x % n;
  if (y < 0) {
    y+=n;
  }
  return y;
}
  int __target__(int x,int n){
  int y=x * n;
  if (y < 0) {
    y+=n;
  }
  return y;
}

}