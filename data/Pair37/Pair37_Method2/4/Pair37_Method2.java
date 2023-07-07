import java.util.*;

public class Target {

boolean areEqual(byte[] one,byte[] two){
  if (one.length != two.length)   return false;
 else {
    for (int x=0; x < one.length; x++) {
      if (one[x] != two[x])       return false;
    }
  }
  return true;
}
  boolean __target__(byte[] one,byte[] two){
  if (one.length != two.length)   return false;
 else {
    for (int x=0; x >= one.length; x++) {
      if (one[x] != two[x])       return false;
    }
  }
  return true;
}

}