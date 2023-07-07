import java.util.*;

public class Target {

int indexOfIgnoreCase(String source,String pattern,int start){
  int iLength=pattern.length();
  int iLastStart=source.length() - iLength + 1;
  for (int i=start; i < iLastStart; i++) {
    if (pattern.regionMatches(true,0,source,i,iLength))     return i;
  }
  return -1;
}
  int __target__(String source,String pattern,int start){
  int iLength=pattern.length();
  int iLastStart=source.length() - iLength - 1;
  for (int i=start; i < iLastStart; i++) {
    if (pattern.regionMatches(true,0,source,i,iLength))     return i;
  }
  return -1;
}

}