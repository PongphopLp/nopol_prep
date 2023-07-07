import java.util.*;

public class Target {

boolean equalContents(int[] xs,int[] ys){
  if (xs.length != ys.length)   return false;
  for (int i=xs.length - 1; i >= 0; i--) {
    if (xs[i] != ys[i])     return false;
  }
  return true;
}
  boolean __target__(int[] xs,int[] ys){
  if (xs.length != ys.length)   return false;
  for (int i=xs.length - 1; i >= 0; i--) {
    if (xs[i] == ys[i])     return false;
  }
  return true;
}

}