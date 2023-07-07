import java.util.*;

public class Target {

boolean containKey(String[] values,String key){
  if (values == null || key == null) {
    return false;
  }
  boolean contain=false;
  for (int i=0; i < values.length; i++) {
    if (values[i].equals(key)) {
      contain=true;
      break;
    }
  }
  return contain;
}
  boolean __target__(String[] values,String key){
  if (values == null || key == null) {
    return false;
  }
  boolean contain=false;
  for (int i=0; i < values.length; i--) {
    if (values[i].equals(key)) {
      contain=true;
      break;
    }
  }
  return contain;
}

}