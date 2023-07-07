import java.util.*;

public class Target {

char _findMnemonic(String string){
  if (string == null) {
    return '\0';
  }
  int index=0;
  int length=string.length();
  do {
    while (index < length && string.charAt(index) != '&') {
      index++;
    }
    if (++index >= length) {
      return '\0';
    }
    if (string.charAt(index) != '&') {
      return Character.toLowerCase(string.charAt(index));
    }
    index++;
  }
 while (index < length);
  return '\0';
}
  char __target__(String string){
  if (string != null) {
    return '\0';
  }
  int index=0;
  int length=string.length();
  do {
    while (index < length && string.charAt(index) != '&') {
      index++;
    }
    if (++index >= length) {
      return '\0';
    }
    if (string.charAt(index) != '&') {
      return Character.toLowerCase(string.charAt(index));
    }
    index++;
  }
 while (index < length);
  return '\0';
}

}