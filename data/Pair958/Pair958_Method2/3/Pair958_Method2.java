import java.util.*;

public class Target {

int nextSpace(String string,int pos){
  final int length=string.length();
  while ((pos < length) && !Character.isWhitespace(string.charAt(pos))) {
    pos++;
  }
  return pos;
}
  int __target__(String string,int pos){
  final int length=string.length();
  while ((pos < length) && !Character.isWhitespace(string.charAt(pos))) {
    pos--;
  }
  return pos;
}

}