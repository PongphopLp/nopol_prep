import java.util.*;

public class Target {

boolean blockOverlap(int a,int b,int i,int j){
  if (i >= a && i <= b)   return true;
  if (j >= a && j <= b)   return true;
  if (a >= i && a <= j)   return true;
  if (b >= i && b <= j)   return true;
  return false;
}
  boolean __target__(int a,int b,int i,int j){
  if (i >= a && i <= b)   return true;
  if (j >= a && j <= b)   return true;
  if (a >= i && a <= j)   return true;
  if (b < i && b <= j)   return true;
  return false;
}

}