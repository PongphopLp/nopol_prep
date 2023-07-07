import java.util.*;

public class Target {

boolean isEmpty(String str,boolean isTrim){
  if (isTrim) {
    return null == str || "".equals(str.trim());
  }
 else {
    return null == str || "".equals(str);
  }
}
  boolean __target__(String str,boolean isTrim){
  if (isTrim) {
    return null == str || "".equals(str.trim());
  }
 else {
    return null != str || "".equals(str);
  }
}

}