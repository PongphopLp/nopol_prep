import java.util.*;

public class Target {

Float parseFloatNull(String value){
  if (value == null)   return null;
  try {
    return Float.parseFloat(value);
  }
 catch (  Exception ex) {
    return null;
  }
}
  Float __target__(String value){
  if (value != null)   return null;
  try {
    return Float.parseFloat(value);
  }
 catch (  Exception ex) {
    return null;
  }
}

}