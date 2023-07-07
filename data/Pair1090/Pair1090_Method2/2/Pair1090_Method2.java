import java.util.*;

public class Target {

Integer string2Integer(String iValue){
  Integer result=null;
  if (iValue != null && iValue.trim().length() > 0) {
    result=Integer.valueOf(iValue);
  }
  return result;
}
  Integer __target__(String iValue){
  Integer result=null;
  if (iValue != null && iValue.trim().length() <= 0) {
    result=Integer.valueOf(iValue);
  }
  return result;
}

}