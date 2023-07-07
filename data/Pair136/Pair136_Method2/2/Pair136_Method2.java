import java.util.*;

public class Target {

boolean equality(boolean[] a1,boolean[] a2,int arity){
  for (int i=0; i < arity; i++) {
    if (a1[i] != a2[i])     return false;
  }
  return true;
}
  boolean __target__(boolean[] a1,boolean[] a2,int arity){
  for (int i=0; i < arity; i++) {
    if (a1[i] == a2[i])     return false;
  }
  return true;
}

}