import java.util.*;

public class Target {

boolean compare(String left,String right){
  boolean ret;
  if ((left == null) && (right == null)) {
    ret=true;
  }
 else   if (right == null && (left != null && left.length() == 0)) {
    ret=true;
  }
 else   if (left == null && (right != null && right.length() == 0)) {
    ret=true;
  }
 else   if ((left == null) || (right == null)) {
    ret=false;
  }
 else {
    ret=left.equals(right);
  }
  return ret;
}
  boolean __target__(String left,String right){
  boolean ret;
  if ((left == null) && (right == null)) {
    ret=true;
  }
 else   if (right == null && (left != null && left.length() == 0)) {
    ret=true;
  }
 else   if (left == null && (right != null && right.length() != 0)) {
    ret=true;
  }
 else   if ((left == null) || (right == null)) {
    ret=false;
  }
 else {
    ret=left.equals(right);
  }
  return ret;
}

}