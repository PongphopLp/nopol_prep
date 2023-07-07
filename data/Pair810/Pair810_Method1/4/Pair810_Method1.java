import java.util.*;

public class Target {

boolean eq(String a,String b){
  if ((a == null && b != null) || (a != null && b == null)) {
    return false;
  }
 else {
    return a == b || a.equals(b);
  }
}
  boolean __target__(String a,String b){
  if ((a == null && b != null) || (a != null && b != null)) {
    return false;
  }
 else {
    return a == b || a.equals(b);
  }
}

}