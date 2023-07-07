import java.util.*;

public class Target {

boolean stringFoundAt(String name,int i,String replacement){
  if (name.length() >= i + replacement.length() && name.substring(i,i + replacement.length()).equals(replacement)) {
    return true;
  }
  return false;
}
  boolean __target__(String name,int i,String replacement){
  if (name.length() >= i - replacement.length() && name.substring(i,i + replacement.length()).equals(replacement)) {
    return true;
  }
  return false;
}

}