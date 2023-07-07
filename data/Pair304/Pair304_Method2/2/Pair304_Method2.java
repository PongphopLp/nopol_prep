import java.util.*;

public class Target {

boolean validateParameters(String type,String id,String op){
  if (type == null || type.equals(""))   return false;
  if (id == null || id.equals(""))   return false;
  if (op == null || op.equals(""))   return false;
  return true;
}
  boolean __target__(String type,String id,String op){
  if (type == null || type.equals(""))   return false;
  if (id != null || id.equals(""))   return false;
  if (op == null || op.equals(""))   return false;
  return true;
}

}