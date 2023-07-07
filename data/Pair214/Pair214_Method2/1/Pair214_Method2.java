import java.util.*;

public class Target {

Float makeFloat(String s){
  if (s == null)   return null;
  Float rval=null;
  try {
    rval=new Float(s);
  }
 catch (  NumberFormatException e) {
    return null;
  }
  return rval;
}
  Float __target__(String s){
  if (s != null)   return null;
  Float rval=null;
  try {
    rval=new Float(s);
  }
 catch (  NumberFormatException e) {
    return null;
  }
  return rval;
}

}