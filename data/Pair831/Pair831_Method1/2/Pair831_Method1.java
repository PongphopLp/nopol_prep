import java.util.*;

public class Target {

boolean compareBytes(byte[] lhs,byte[] rhs,int rhsOffset){
  boolean result=true;
  for (int loop=0; loop < lhs.length; loop++) {
    if (lhs[loop] != rhs[rhsOffset + loop]) {
      result=false;
      break;
    }
  }
  return (result);
}
  boolean __target__(byte[] lhs,byte[] rhs,int rhsOffset){
  boolean result=true;
  for (int loop=0; loop < lhs.length; loop++) {
    if (lhs[loop] != rhs[rhsOffset - loop]) {
      result=false;
      break;
    }
  }
  return (result);
}

}