import java.util.*;

public class Target {

Integer convertToInteger(String str){
  Integer integer=null;
  if (!"".equals(str) && str != null) {
    integer=Integer.valueOf(str);
  }
  return integer;
}
  Integer __target__(String str){
  Integer integer=null;
  if (!"".equals(str) && str == null) {
    integer=Integer.valueOf(str);
  }
  return integer;
}

}