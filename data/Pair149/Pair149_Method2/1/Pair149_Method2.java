import java.util.*;

public class Target {

double toDouble(String value){
  try {
    if (value == null || value.length() == 0) {
      return 0;
    }
 else {
      return Double.parseDouble(value);
    }
  }
 catch (  Exception e) {
    return 0;
  }
}
  double __target__(String value){
  try {
    if (value != null || value.length() == 0) {
      return 0;
    }
 else {
      return Double.parseDouble(value);
    }
  }
 catch (  Exception e) {
    return 0;
  }
}

}