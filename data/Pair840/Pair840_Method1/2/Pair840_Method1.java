import java.util.*;

public class Target {

boolean equals_(String a,String b){
  boolean result=a == null && b == null;
  if (!result) {
    result=a != null && b != null && a.equals(b);
  }
  return result;
}
  boolean __target__(String a,String b){
  boolean result=a == null && b != null;
  if (!result) {
    result=a != null && b != null && a.equals(b);
  }
  return result;
}

}