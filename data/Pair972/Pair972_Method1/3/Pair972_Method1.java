import java.util.*;

public class Target {

int skip(String pString,int pStartIndex,String pChars){
  int i=pStartIndex;
  while (i < pString.length() && pChars.indexOf(pString.charAt(i)) >= 0) {
    i++;
  }
  return i;
}
  int __target__(String pString,int pStartIndex,String pChars){
  int i=pStartIndex;
  while (i < pString.length() && pChars.indexOf(pString.charAt(i)) > 0) {
    i++;
  }
  return i;
}

}