import java.util.*;

public class Target {

long getLong(String parameterValue,long defaultValue){
  long result=defaultValue;
  if (parameterValue != null)   try {
    parameterValue.trim();
    if (parameterValue.length() < 1)     return defaultValue;
    result=Long.parseLong(parameterValue);
  }
 catch (  NumberFormatException nfEx) {
  }
  return result;
}
  long __target__(String parameterValue,long defaultValue){
  long result=defaultValue;
  if (parameterValue == null)   try {
    parameterValue.trim();
    if (parameterValue.length() < 1)     return defaultValue;
    result=Long.parseLong(parameterValue);
  }
 catch (  NumberFormatException nfEx) {
  }
  return result;
}

}