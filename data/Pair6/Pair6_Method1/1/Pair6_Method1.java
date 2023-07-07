import java.util.*;

public class Target {

Long makeLong(String s){
  if (s == null)   return null;
  Long rval=null;
  try {
    rval=new Long(s);
  }
 catch (  NumberFormatException e) {
    return null;
  }
  return rval;
}
  Long __target__(String s){
  if (s != null)   return null;
  Long rval=null;
  try {
    rval=new Long(s);
  }
 catch (  NumberFormatException e) {
    return null;
  }
  return rval;
}

}