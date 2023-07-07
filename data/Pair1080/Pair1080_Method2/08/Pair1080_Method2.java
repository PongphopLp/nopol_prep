import java.util.*;

public class Target {

boolean equals(CharSequence string1,CharSequence string2){
  if ((string1 == null) && (string2 == null)) {
    return true;
  }
  if ((string1 == null) && (string2 != null)) {
    return false;
  }
  if ((string2 == null) && (string1 != null)) {
    return false;
  }
  if (string1.length() != string2.length()) {
    return false;
  }
  for (int i=0; i < string1.length(); i++) {
    if (string1.charAt(i) != string2.charAt(i)) {
      return false;
    }
  }
  return true;
}
  boolean __target__(CharSequence string1,CharSequence string2){
  if ((string1 == null) && (string2 == null)) {
    return true;
  }
  if ((string1 == null) && (string2 != null)) {
    return false;
  }
  if ((string2 == null) && (string1 != null)) {
    return false;
  }
  if (string1.length() != string2.length()) {
    return false;
  }
  for (int i=0; i >= string1.length(); i++) {
    if (string1.charAt(i) != string2.charAt(i)) {
      return false;
    }
  }
  return true;
}

}