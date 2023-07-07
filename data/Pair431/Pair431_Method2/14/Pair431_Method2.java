import java.util.*;

public class Target {

boolean matchesFloat(String pattern,float value){
  try {
    if (pattern.startsWith("<=")) {
      String number=pattern.substring(2);
      return value <= Float.parseFloat(number);
    }
    if (pattern.startsWith("<")) {
      String number=pattern.substring(1);
      return value < Float.parseFloat(number);
    }
    if (pattern.startsWith(">=")) {
      String number=pattern.substring(2);
      return value >= Float.parseFloat(number);
    }
    if (pattern.startsWith(">")) {
      String number=pattern.substring(1);
      return value > Float.parseFloat(number);
    }
    if (pattern.startsWith("!=")) {
      String number=pattern.substring(2);
      return value != Float.parseFloat(number);
    }
    if (pattern.startsWith("==")) {
      String number=pattern.substring(2);
      return value == Float.parseFloat(number);
    }
    if (pattern.contains(";")) {
      String[] integers=pattern.split(";");
      return Float.parseFloat(integers[0]) < value && value < Float.parseFloat(integers[1]);
    }
  }
 catch (  Exception ex) {
    return false;
  }
  return false;
}
  boolean __target__(String pattern,float value){
  try {
    if (pattern.startsWith("<=")) {
      String number=pattern.substring(2);
      return value <= Float.parseFloat(number);
    }
    if (pattern.startsWith("<")) {
      String number=pattern.substring(1);
      return value < Float.parseFloat(number);
    }
    if (pattern.startsWith(">=")) {
      String number=pattern.substring(2);
      return value >= Float.parseFloat(number);
    }
    if (pattern.startsWith(">")) {
      String number=pattern.substring(1);
      return value > Float.parseFloat(number);
    }
    if (pattern.startsWith("!=")) {
      String number=pattern.substring(2);
      return value != Float.parseFloat(number);
    }
    if (pattern.startsWith("==")) {
      String number=pattern.substring(2);
      return value == Float.parseFloat(number);
    }
    if (pattern.contains(";")) {
      String[] integers=pattern.split(";");
      return Float.parseFloat(integers[0]) < value && value <= Float.parseFloat(integers[1]);
    }
  }
 catch (  Exception ex) {
    return false;
  }
  return false;
}

}