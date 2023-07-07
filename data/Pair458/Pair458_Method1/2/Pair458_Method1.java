import java.util.*;

public class Target {

boolean isValidEntry(String key,String value){
  boolean load;
  int pos1;
  if (key.startsWith("sfx.")) {
    if ((pos1=value.indexOf(',')) > -1) {
      load=value.substring(pos1 + 1).charAt(0) != 'x';
    }
 else {
      load=true;
    }
    load|=value.indexOf('.') != -1;
    return load;
  }
 else {
    return false;
  }
}
  boolean __target__(String key,String value){
  boolean load;
  int pos1;
  if (key.startsWith("sfx.")) {
    if ((pos1=value.indexOf(',')) > -1) {
      load=value.substring(pos1 + 1).charAt(0) == 'x';
    }
 else {
      load=true;
    }
    load|=value.indexOf('.') != -1;
    return load;
  }
 else {
    return false;
  }
}

}