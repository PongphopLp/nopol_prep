import java.util.*;

public class Target {

String getString(String str,int limit){
  if (str.length() <= limit)   return str;
  String s0=str.substring(0,limit);
  s0+="...";
  return s0;
}
  String __target__(String str,int limit){
  if (str.length() > limit)   return str;
  String s0=str.substring(0,limit);
  s0+="...";
  return s0;
}

}