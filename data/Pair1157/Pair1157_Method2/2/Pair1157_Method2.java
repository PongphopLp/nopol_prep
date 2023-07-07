import java.util.*;

public class Target {

String getFieldMethodName(String prefix,String fieldName){
  char f=fieldName.charAt(0);
  if (f >= 'a' && f <= 'z') {
    f=(char)(f - 32);
  }
  return new StringBuffer(prefix).append(f).append(fieldName.substring(1)).toString();
}
  String __target__(String prefix,String fieldName){
  char f=fieldName.charAt(0);
  if (f >= 'a' && f < 'z') {
    f=(char)(f - 32);
  }
  return new StringBuffer(prefix).append(f).append(fieldName.substring(1)).toString();
}

}