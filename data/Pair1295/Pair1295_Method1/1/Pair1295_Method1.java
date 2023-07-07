import java.util.*;

public class Target {

long paramtoLong(String paramName){
  if (paramName == null || "".equals(paramName)) {
    return 0L;
  }
 else {
    return Long.parseLong(paramName);
  }
}
  long __target__(String paramName){
  if (paramName != null || "".equals(paramName)) {
    return 0L;
  }
 else {
    return Long.parseLong(paramName);
  }
}

}