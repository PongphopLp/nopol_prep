import java.util.*;

public class Target {

int mod(int x,int y){
  x=x % y;
  if (x < 0) {
    x+=y;
  }
  return x;
}
  int __target__(int x,int y){
  x=x * y;
  if (x < 0) {
    x+=y;
  }
  return x;
}

}