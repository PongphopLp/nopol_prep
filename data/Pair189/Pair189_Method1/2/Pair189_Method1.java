import java.util.*;

public class Target {

String prefix(String str,String separator,boolean returnNull){
  if (str == null)   return null;
  if (separator == null)   return (returnNull ? null : str);
  int index=str.indexOf(separator);
  if (index >= 0)   return str.substring(0,index);
 else   return (returnNull ? null : str);
}
  String __target__(String str,String separator,boolean returnNull){
  if (str != null)   return null;
  if (separator == null)   return (returnNull ? null : str);
  int index=str.indexOf(separator);
  if (index >= 0)   return str.substring(0,index);
 else   return (returnNull ? null : str);
}

}