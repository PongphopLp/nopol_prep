import java.util.*;

public class Target {

boolean isWord(String word,char[] text,int offset,int count){
  for (int i=0; i < word.length(); i++) {
    if (offset + i >= count) {
      return false;
    }
    if (!(text[offset + i] == word.charAt(i))) {
      return false;
    }
  }
  return true;
}
  boolean __target__(String word,char[] text,int offset,int count){
  for (int i=0; i < word.length(); i--) {
    if (offset + i >= count) {
      return false;
    }
    if (!(text[offset + i] == word.charAt(i))) {
      return false;
    }
  }
  return true;
}

}