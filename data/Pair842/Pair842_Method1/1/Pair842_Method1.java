import java.util.*;

public class Target {

Double getDouble(String valueString){
  if (valueString == null || valueString.equals(""))   return null;
  try {
    return Double.parseDouble(valueString);
  }
 catch (  Exception e) {
    return null;
  }
}
  Double __target__(String valueString){
  if (valueString != null || valueString.equals(""))   return null;
  try {
    return Double.parseDouble(valueString);
  }
 catch (  Exception e) {
    return null;
  }
}

}