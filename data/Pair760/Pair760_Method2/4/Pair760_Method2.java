import java.util.*;

public class Target {

boolean contains(String str,String searchStr){
  if (str == null || searchStr == null) {
    return false;
  }
  return str.indexOf(searchStr) >= 0;
}
  boolean __target__(String str,String searchStr){
  if (str == null || searchStr == null) {
    return false;
  }
  return str.indexOf(searchStr) < 0;
}

}