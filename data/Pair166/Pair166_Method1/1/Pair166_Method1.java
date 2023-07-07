import java.util.*;

public class Target {

double stringToDouble(String str){
  if (str == null || str.equals("")) {
    return 0;
  }
  return (new Double(str).doubleValue());
}
  double __target__(String str){
  if (str != null || str.equals("")) {
    return 0;
  }
  return (new Double(str).doubleValue());
}

}