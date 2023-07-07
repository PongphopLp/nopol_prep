import java.util.*;

public class Target {

Double toDouble(String string){
  if (string == null)   return null;
  try {
    return new Double(string.trim());
  }
 catch (  Exception e) {
    return null;
  }
}
  Double __target__(String string){
  if (string != null)   return null;
  try {
    return new Double(string.trim());
  }
 catch (  Exception e) {
    return null;
  }
}

}