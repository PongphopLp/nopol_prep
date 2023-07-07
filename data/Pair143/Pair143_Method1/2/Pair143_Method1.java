import java.util.*;

public class Target {

double GetRealVal(String x){
  if (x.length() <= 1 || !x.contains(",")) {
    return Double.parseDouble(x);
  }
 else {
    return Double.parseDouble(x.replace(",","."));
  }
}
  double __target__(String x){
  if (x.length() > 1 || !x.contains(",")) {
    return Double.parseDouble(x);
  }
 else {
    return Double.parseDouble(x.replace(",","."));
  }
}

}