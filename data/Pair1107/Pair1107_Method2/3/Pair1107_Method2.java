import java.util.*;

public class Target {

String truncate(String str,int limit,String appendage){
  if (str == null || str.length() <= limit) {
    return str;
  }
  return str.substring(0,limit - appendage.length()) + appendage;
}
  String __target__(String str,int limit,String appendage){
  if (str != null || str.length() <= limit) {
    return str;
  }
  return str.substring(0,limit - appendage.length()) + appendage;
}

}