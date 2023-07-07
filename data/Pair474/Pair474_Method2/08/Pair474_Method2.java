import java.util.*;

public class Target {

boolean isMixedCase(String word,boolean sentence){
  final int length=word.length();
  boolean upper=Character.isUpperCase(word.charAt(0));
  if (sentence && upper && (length > 1))   upper=Character.isUpperCase(word.charAt(1));
  if (upper) {
    for (int index=length - 1; index > 0; index--) {
      if (Character.isLowerCase(word.charAt(index)))       return true;
    }
  }
 else {
    for (int index=length - 1; index > 0; index--) {
      if (Character.isUpperCase(word.charAt(index)))       return true;
    }
  }
  return false;
}
  boolean __target__(String word,boolean sentence){
  final int length=word.length();
  boolean upper=Character.isUpperCase(word.charAt(0));
  if (sentence && upper && (length >= 1))   upper=Character.isUpperCase(word.charAt(1));
  if (upper) {
    for (int index=length - 1; index > 0; index--) {
      if (Character.isLowerCase(word.charAt(index)))       return true;
    }
  }
 else {
    for (int index=length - 1; index > 0; index--) {
      if (Character.isUpperCase(word.charAt(index)))       return true;
    }
  }
  return false;
}

}