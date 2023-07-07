import java.util.*;

public class Target {

boolean charArrayCMP(char[] src,char[] des){
  if (src.length != des.length)   return false;
  for (int i=src.length - 1; i >= 0; i--) {
    if (src[i] != des[i])     return false;
  }
  return true;
}
  boolean __target__(char[] src,char[] des){
  if (src.length != des.length)   return false;
  for (int i=src.length - 1; i > 0; i--) {
    if (src[i] != des[i])     return false;
  }
  return true;
}

}