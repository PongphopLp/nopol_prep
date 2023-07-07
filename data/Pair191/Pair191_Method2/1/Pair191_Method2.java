import java.util.*;

public class Target {

@SuppressWarnings("unchecked") int getFromMapAsInt(Map map,String name){
  Object val=map.get(name);
  int ret=0;
  if (val != null && val instanceof Number) {
    ret=((Number)val).intValue();
  }
  return ret;
}
  @SuppressWarnings("unchecked") int __target__(Map map,String name){
  Object val=map.get(name);
  int ret=0;
  if (val == null && val instanceof Number) {
    ret=((Number)val).intValue();
  }
  return ret;
}

}