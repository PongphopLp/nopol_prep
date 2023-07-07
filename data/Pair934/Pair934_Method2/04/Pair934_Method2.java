import java.util.*;

public class Target {

boolean ulcmp(long a,long b){
  if ((b < 0L) && (a >= 0L))   return true;
  if ((b >= 0L) && (a < 0L))   return false;
  return a < b;
}
  boolean __target__(long a,long b){
  if ((b < 0L) && (a >= 0L))   return true;
  if ((b >= 0L) && (a >= 0L))   return false;
  return a < b;
}

}