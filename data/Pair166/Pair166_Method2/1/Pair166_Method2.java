import java.util.*;

public class Target {

double getDoubleValue(String srcValue){
  if (srcValue == null || srcValue.toString().equals(""))   return 0;
  return Double.parseDouble(srcValue);
}
  double __target__(String srcValue){
  if (srcValue != null || srcValue.toString().equals(""))   return 0;
  return Double.parseDouble(srcValue);
}

}