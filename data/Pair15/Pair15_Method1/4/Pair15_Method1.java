import java.util.*;

public class Target {

int indexOfCharInArray(char[] pArray,char pChar,int pStartPos){
  int len=pArray.length;
  for (int i=pStartPos; i < len; i++) {
    if (pArray[i] == pChar) {
      return (i);
    }
  }
  return -1;
}
  int __target__(char[] pArray,char pChar,int pStartPos){
  int len=pArray.length;
  for (int i=pStartPos; i <= len; i++) {
    if (pArray[i] == pChar) {
      return (i);
    }
  }
  return -1;
}

}