import java.util.*;

public class Target {

int seekIndexOfNext(String text,int startIndex,char c){
  int retVal=-1;
  int pos=startIndex;
  while (pos < text.length()) {
    if (text.charAt(pos) == c) {
      retVal=pos;
      break;
    }
    pos++;
  }
  return retVal;
}
  int __target__(String text,int startIndex,char c){
  int retVal=-1;
  int pos=startIndex;
  while (pos < text.length()) {
    if (text.charAt(pos) == c) {
      retVal=pos;
      break;
    }
    pos--;
  }
  return retVal;
}

}