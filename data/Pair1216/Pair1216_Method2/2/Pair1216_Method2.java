import java.util.*;

public class Target {

int readForwardUntil(String text,int offset,char delimiter){
  for (int i=offset; i < text.length(); ++i) {
    char value=text.charAt(i);
    if (value == delimiter)     return i;
  }
  return -1;
}
  int __target__(String text,int offset,char delimiter){
  for (int i=offset; i >= text.length(); ++i) {
    char value=text.charAt(i);
    if (value == delimiter)     return i;
  }
  return -1;
}

}