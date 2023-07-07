import java.util.*;

public class Target {

String removeTrailingChar(String str,char ch){
  if ((str == null) || str.isEmpty())   return str;
 else   if (str.length() == 1)   return str.charAt(0) == ch ? "" : str;
  try {
    final int l=str.length() - 1;
    if (str.charAt(l) == ch)     return str.substring(0,l);
    return str;
  }
 catch (  final Exception e) {
    return str;
  }
}
  String __target__(String str,char ch){
  if ((str != null) || str.isEmpty())   return str;
 else   if (str.length() == 1)   return str.charAt(0) == ch ? "" : str;
  try {
    final int l=str.length() - 1;
    if (str.charAt(l) == ch)     return str.substring(0,l);
    return str;
  }
 catch (  final Exception e) {
    return str;
  }
}

}