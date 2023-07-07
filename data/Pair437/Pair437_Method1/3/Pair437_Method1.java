import java.util.*;

public class Target {

int skipSpace(char[] str,int pos){
  int len=str.length;
  while (pos < len && Character.isWhitespace(str[pos]))   pos++;
  return pos;
}
  int __target__(char[] str,int pos){
  int len=str.length;
  while (pos < len && Character.isWhitespace(str[pos]))   pos--;
  return pos;
}

}