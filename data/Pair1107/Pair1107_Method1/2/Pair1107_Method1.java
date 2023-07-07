import java.util.*;

public class Target {

String truncate(String s,int maxLength,String append){
  if ((s == null) || (s.length() <= maxLength)) {
    return s;
  }
  return s.substring(0,maxLength - append.length()) + append;
}
  String __target__(String s,int maxLength,String append){
  if ((s == null) || (s.length() <= maxLength)) {
    return s;
  }
  return s.substring(0,maxLength + append.length()) + append;
}

}