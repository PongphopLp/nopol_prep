import java.util.*;

public class Target {

boolean evalBoolean(String exp){
  if (exp == null)   return false;
  exp=exp.trim().toLowerCase();
  return exp.equals("true") || exp.equals("yes") || exp.equals("1");
}
  boolean __target__(String exp){
  if (exp != null)   return false;
  exp=exp.trim().toLowerCase();
  return exp.equals("true") || exp.equals("yes") || exp.equals("1");
}

}