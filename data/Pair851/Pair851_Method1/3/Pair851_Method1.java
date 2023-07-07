import java.util.*;

public class Target {

Double string2Double(String dValue){
  Double result=null;
  if (dValue != null && dValue.trim().length() > 0) {
    result=Double.valueOf(dValue);
  }
  return result;
}
  Double __target__(String dValue){
  Double result=null;
  if (dValue != null && dValue.trim().length() >= 0) {
    result=Double.valueOf(dValue);
  }
  return result;
}

}