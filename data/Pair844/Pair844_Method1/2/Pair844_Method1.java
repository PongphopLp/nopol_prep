import java.util.*;

public class Target {

Double parseStringToDouble(String theDoubleValue){
  if (theDoubleValue == null || theDoubleValue.length() == 0) {
    return null;
  }
  Double parsedDouble=null;
  try {
    parsedDouble=Double.parseDouble(theDoubleValue);
  }
 catch (  Exception anException) {
    return null;
  }
  return parsedDouble;
}
  Double __target__(String theDoubleValue){
  if (theDoubleValue == null || theDoubleValue.length() != 0) {
    return null;
  }
  Double parsedDouble=null;
  try {
    parsedDouble=Double.parseDouble(theDoubleValue);
  }
 catch (  Exception anException) {
    return null;
  }
  return parsedDouble;
}

}