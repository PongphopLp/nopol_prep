import java.util.*;

public class Target {

Double formatDouble(String value){
  if (value == null) {
    return null;
  }
  try {
    return new Double(value);
  }
 catch (  NumberFormatException e) {
    return null;
  }
}
  Double __target__(String value){
  if (value != null) {
    return null;
  }
  try {
    return new Double(value);
  }
 catch (  NumberFormatException e) {
    return null;
  }
}

}