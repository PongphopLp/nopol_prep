import java.util.*;

public class Target {

String truncateString(String str,int truncLen,String lastStr){
  if (str == null)   return str;
  int len=str.length();
  if (len <= truncLen)   return str;
  return str.substring(0,truncLen) + ((lastStr == null) ? "" : lastStr);
}
  String __target__(String str,int truncLen,String lastStr){
  if (str == null)   return str;
  int len=str.length();
  if (len < truncLen)   return str;
  return str.substring(0,truncLen) + ((lastStr == null) ? "" : lastStr);
}

}