import java.util.*;

public class Target {

Long parseNumber(String string){
  if (string == null)   return null;
  try {
    return new Long(string);
  }
 catch (  NumberFormatException exception) {
    return null;
  }
}
  Long __target__(String string){
  if (string != null)   return null;
  try {
    return new Long(string);
  }
 catch (  NumberFormatException exception) {
    return null;
  }
}

}