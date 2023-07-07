import java.util.*;

public class Target {

boolean isSpace(char[] text,int len){
  boolean space=true;
  for (int i=0; i < len; i++) {
    char c=text[i];
    if (c != ' ' && c != '\t' && c != '\n' && c != '\r') {
      space=false;
      break;
    }
  }
  return space;
}
  boolean __target__(char[] text,int len){
  boolean space=true;
  for (int i=0; i < len; i++) {
    char c=text[i];
    if (c != ' ' && c == '\t' && c != '\n' && c != '\r') {
      space=false;
      break;
    }
  }
  return space;
}

}