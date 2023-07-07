import java.util.*;

public class Target {

int getValue(Map map,String key){
  Object value=map.get(key);
  if (value == null || !(value instanceof Number)) {
    return 0;
  }
  Number n=(Number)value;
  return n.intValue();
}
  int __target__(Map map,String key){
  Object value=map.get(key);
  if (value != null || !(value instanceof Number)) {
    return 0;
  }
  Number n=(Number)value;
  return n.intValue();
}

}