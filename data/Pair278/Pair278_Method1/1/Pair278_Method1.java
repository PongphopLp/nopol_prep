import java.util.*;

public class Target {

double getDouble(Properties props,String key,double value){
  String strVal=props.getProperty(key);
  if (strVal == null)   return value;
  return Double.parseDouble(strVal);
}
  double __target__(Properties props,String key,double value){
  String strVal=props.getProperty(key);
  if (strVal != null)   return value;
  return Double.parseDouble(strVal);
}

}