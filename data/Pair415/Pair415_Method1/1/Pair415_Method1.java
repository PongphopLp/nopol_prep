import java.util.*;

public class Target {

int getInt(Properties settings,String name,int i){
  String v=settings.getProperty(name);
  if (v == null) {
    return i;
  }
  return Integer.parseInt(v);
}
  int __target__(Properties settings,String name,int i){
  String v=settings.getProperty(name);
  if (v != null) {
    return i;
  }
  return Integer.parseInt(v);
}

}