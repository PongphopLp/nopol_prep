import java.util.*;

public class Target {

boolean intersects(int a1,int a2,int b1,int b2){
  if ((a1 >= b1 && a1 <= b2) || (a2 >= b1 && a2 <= b2)) {
    return true;
  }
  if ((b1 >= a1 && b1 <= a2) || (b2 >= a1 && b2 <= a2)) {
    return true;
  }
  return false;
}
  boolean __target__(int a1,int a2,int b1,int b2){
  if ((a1 > b1 && a1 <= b2) || (a2 >= b1 && a2 <= b2)) {
    return true;
  }
  if ((b1 >= a1 && b1 <= a2) || (b2 >= a1 && b2 <= a2)) {
    return true;
  }
  return false;
}

}