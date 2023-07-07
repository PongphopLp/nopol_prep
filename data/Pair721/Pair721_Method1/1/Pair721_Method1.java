import java.util.*;

public class Target {

Byte makeByte(String s){
  if (s == null)   return null;
  Byte rval;
  try {
    rval=new Byte(s);
  }
 catch (  NumberFormatException e) {
    return null;
  }
  return rval;
}
  Byte __target__(String s){
  if (s != null)   return null;
  Byte rval;
  try {
    rval=new Byte(s);
  }
 catch (  NumberFormatException e) {
    return null;
  }
  return rval;
}

}