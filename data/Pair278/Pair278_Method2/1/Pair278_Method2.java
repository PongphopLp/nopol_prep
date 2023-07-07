import java.util.*;

public class Target {

double getDouble(Properties p,String key,double def){
  String val=p.getProperty(key);
  if (val == null) {
    return def;
  }
 else {
    return Double.parseDouble(val);
  }
}
  double __target__(Properties p,String key,double def){
  String val=p.getProperty(key);
  if (val != null) {
    return def;
  }
 else {
    return Double.parseDouble(val);
  }
}

}