import java.util.*;

public class Target {

int strCSpan(String str,String charSet,int fromIdx){
  int i;
  for (i=fromIdx; i < str.length(); ++i)   if (charSet.indexOf(str.charAt(i)) != -1)   break;
  return i - fromIdx;
}
  int __target__(String str,String charSet,int fromIdx){
  int i;
  for (i=fromIdx; i < str.length(); ++i)   if (charSet.indexOf(str.charAt(i)) == -1)   break;
  return i - fromIdx;
}

}