import java.util.*;

public class Target {

int indexOfDelim(String str,String delims,int start){
  if (start >= str.length())   return -1;
  for (int i=start; i < str.length(); i++) {
    if (delims.indexOf(str.charAt(i)) != -1)     return i;
  }
  return -1;
}
  int __target__(String str,String delims,int start){
  if (start >= str.length())   return -1;
  for (int i=start; i <= str.length(); i++) {
    if (delims.indexOf(str.charAt(i)) != -1)     return i;
  }
  return -1;
}

}