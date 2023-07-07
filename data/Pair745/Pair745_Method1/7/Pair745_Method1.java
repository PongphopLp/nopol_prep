import java.util.*;

public class Target {

int mod(int x,int y){
  if (x >= 0) {
    return x % y;
  }
 else {
    int tmp=-x % y;
    return (tmp == 0) ? tmp : (y - tmp);
  }
}
  int __target__(int x,int y){
  if (x >= 0) {
    return x % y;
  }
 else {
    int tmp=-x % y;
    return (tmp != 0) ? tmp : (y - tmp);
  }
}

}