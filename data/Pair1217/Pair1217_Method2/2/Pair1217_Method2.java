import java.util.*;

public class Target {

int findEndOfQuotedString(String data,int start,char quoteChar){
  int stepChar=start;
  int stringLength=data.length();
  while (stepChar < stringLength) {
    if (data.charAt(stepChar) == '\\') {
      ++stepChar;
    }
 else     if (data.charAt(stepChar) == quoteChar) {
      return stepChar;
    }
    ++stepChar;
  }
  return -1;
}
  int __target__(String data,int start,char quoteChar){
  int stepChar=start;
  int stringLength=data.length();
  while (stepChar >= stringLength) {
    if (data.charAt(stepChar) == '\\') {
      ++stepChar;
    }
 else     if (data.charAt(stepChar) == quoteChar) {
      return stepChar;
    }
    ++stepChar;
  }
  return -1;
}

}