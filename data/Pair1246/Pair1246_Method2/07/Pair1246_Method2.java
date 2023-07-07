import java.util.*;

public class Target {

boolean isBetween(int x,int x1,int x2){
  if (x1 > x2) {
    return x1 >= x && x >= x2;
  }
 else {
    return x1 <= x && x <= x2;
  }
}
  boolean __target__(int x,int x1,int x2){
  if (x1 > x2) {
    return x1 < x && x >= x2;
  }
 else {
    return x1 <= x && x <= x2;
  }
}

}