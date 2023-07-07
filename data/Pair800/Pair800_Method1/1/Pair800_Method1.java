import java.util.*;

public class Target {

boolean checkString(int min,int max,String string){
  int length=string.length();
  if (length < min || length > max) {
    return false;
  }
 else {
    return true;
  }
}
  boolean __target__(int min,int max,String string){
  int length=string.length();
  if (length >= min || length > max) {
    return false;
  }
 else {
    return true;
  }
}

}