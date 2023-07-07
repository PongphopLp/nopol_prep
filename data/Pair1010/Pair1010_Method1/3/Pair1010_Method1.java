import java.util.*;

public class Target {

int skipWhiteSpace(String rawdata,int i){
  int length=rawdata.length();
  if (i < length) {
    char c=rawdata.charAt(i);
    while ((i < length) && Character.isWhitespace(c)) {
      ++i;
      c=rawdata.charAt(i);
    }
  }
  return i;
}
  int __target__(String rawdata,int i){
  int length=rawdata.length();
  if (i < length) {
    char c=rawdata.charAt(i);
    while ((i >= length) && Character.isWhitespace(c)) {
      ++i;
      c=rawdata.charAt(i);
    }
  }
  return i;
}

}