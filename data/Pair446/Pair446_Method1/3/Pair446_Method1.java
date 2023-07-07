import java.util.*;

public class Target {

int indexOfIgnoreCase(String textToSearch,String pattern,int fromIndex){
  int n=pattern.length();
  while (textToSearch.length() > ((fromIndex + n) - 1)) {
    if (textToSearch.regionMatches(true,fromIndex,pattern,0,n)) {
      return fromIndex;
    }
    fromIndex++;
  }
  return -1;
}
  int __target__(String textToSearch,String pattern,int fromIndex){
  int n=pattern.length();
  while (textToSearch.length() <= ((fromIndex + n) - 1)) {
    if (textToSearch.regionMatches(true,fromIndex,pattern,0,n)) {
      return fromIndex;
    }
    fromIndex++;
  }
  return -1;
}

}