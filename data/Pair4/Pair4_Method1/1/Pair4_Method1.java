import java.util.*;

public class Target {

Long maybeParseLong(String text){
  if (text == null) {
    return null;
  }
  Long number=null;
  try {
    number=Long.valueOf(text);
  }
 catch (  NumberFormatException e) {
  }
  return number;
}
  Long __target__(String text){
  if (text != null) {
    return null;
  }
  Long number=null;
  try {
    number=Long.valueOf(text);
  }
 catch (  NumberFormatException e) {
  }
  return number;
}

}