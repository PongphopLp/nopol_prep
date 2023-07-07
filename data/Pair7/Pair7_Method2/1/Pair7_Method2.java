import java.util.*;

public class Target {

Long parseNumeric(String text){
  if (text == null) {
    return null;
  }
  try {
    return (Long.parseLong(text));
  }
 catch (  NumberFormatException e) {
    return null;
  }
}
  Long __target__(String text){
  if (text != null) {
    return null;
  }
  try {
    return (Long.parseLong(text));
  }
 catch (  NumberFormatException e) {
    return null;
  }
}

}