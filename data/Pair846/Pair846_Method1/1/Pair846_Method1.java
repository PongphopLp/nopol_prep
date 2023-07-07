import java.util.*;

public class Target {

Double maybeParseDouble(String text){
  if (text == null) {
    return null;
  }
  Double number=null;
  try {
    number=Double.valueOf(text);
  }
 catch (  NumberFormatException e) {
  }
  return number;
}
  Double __target__(String text){
  if (text != null) {
    return null;
  }
  Double number=null;
  try {
    number=Double.valueOf(text);
  }
 catch (  NumberFormatException e) {
  }
  return number;
}

}