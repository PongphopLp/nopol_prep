import java.util.*;

public class Target {

Integer makeInteger(String s){
  if (s == null)   return null;
  Integer rval=null;
  try {
    rval=new Integer(s);
  }
 catch (  NumberFormatException e) {
    return null;
  }
  return rval;
}
  Integer __target__(String s){
  if (s != null)   return null;
  Integer rval=null;
  try {
    rval=new Integer(s);
  }
 catch (  NumberFormatException e) {
    return null;
  }
  return rval;
}

}