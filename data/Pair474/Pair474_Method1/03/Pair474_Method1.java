import java.util.*;

public class Target {

boolean isMixedCaseWord(String word,boolean startsSentance){
  int strLen=word.length();
  boolean isUpper=Character.isUpperCase(word.charAt(0));
  if ((startsSentance) && isUpper && (strLen > 1))   isUpper=Character.isUpperCase(word.charAt(1));
  if (isUpper) {
    for (int i=word.length() - 1; i > 0; i--) {
      if (Character.isLowerCase(word.charAt(i))) {
        return true;
      }
    }
  }
 else {
    for (int i=word.length() - 1; i > 0; i--) {
      if (Character.isUpperCase(word.charAt(i))) {
        return true;
      }
    }
  }
  return false;
}
  boolean __target__(String word,boolean startsSentance){
  int strLen=word.length();
  boolean isUpper=Character.isUpperCase(word.charAt(0));
  if ((startsSentance) && isUpper && (strLen <= 1))   isUpper=Character.isUpperCase(word.charAt(1));
  if (isUpper) {
    for (int i=word.length() - 1; i > 0; i--) {
      if (Character.isLowerCase(word.charAt(i))) {
        return true;
      }
    }
  }
 else {
    for (int i=word.length() - 1; i > 0; i--) {
      if (Character.isUpperCase(word.charAt(i))) {
        return true;
      }
    }
  }
  return false;
}

}