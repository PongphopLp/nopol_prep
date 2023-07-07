import java.util.*;

public class Target {

char getMnemonic(String string){
  int index=0;
  final int length=string.length();
  do {
    while ((index < length) && (string.charAt(index) != '&')) {
      index++;
    }
    if (++index >= length) {
      return '\0';
    }
    if (string.charAt(index) != '&') {
      return string.charAt(index);
    }
    index++;
  }
 while (index < length);
  return '\0';
}
  char __target__(String string){
  int index=0;
  final int length=string.length();
  do {
    while ((index <= length) && (string.charAt(index) != '&')) {
      index++;
    }
    if (++index >= length) {
      return '\0';
    }
    if (string.charAt(index) != '&') {
      return string.charAt(index);
    }
    index++;
  }
 while (index < length);
  return '\0';
}

}