import java.util.*;

public class Target {

int _getEndPos(char[] charArray,int pos){
  while (true) {
    if (pos >= charArray.length) {
      break;
    }
    if (!Character.isDigit(charArray[pos])) {
      break;
    }
    pos++;
  }
  return pos;
}
  int __target__(char[] charArray,int pos){
  while (true) {
    if (pos > charArray.length) {
      break;
    }
    if (!Character.isDigit(charArray[pos])) {
      break;
    }
    pos++;
  }
  return pos;
}

}