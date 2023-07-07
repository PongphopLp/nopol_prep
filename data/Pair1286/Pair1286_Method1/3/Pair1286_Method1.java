import java.util.*;

public class Target {

boolean matches(Class[] formals,Class[] actuals){
  if (formals.length != actuals.length)   return false;
  for (int i=0; i < formals.length; i++) {
    if (!(formals[i] == actuals[i])) {
      return false;
    }
  }
  return true;
}
  boolean __target__(Class[] formals,Class[] actuals){
  if (formals.length != actuals.length)   return false;
  for (int i=0; i < formals.length; i++) {
    if (!(formals[i] != actuals[i])) {
      return false;
    }
  }
  return true;
}

}