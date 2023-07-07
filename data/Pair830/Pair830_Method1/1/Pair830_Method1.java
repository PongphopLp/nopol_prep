import java.util.*;

public class Target {

int skipNonWhitespace(String string,int p){
  while (p < string.length() && !Character.isWhitespace(string.charAt(p))) {
    p++;
  }
  return p;
}
  int __target__(String string,int p){
  while (p <= string.length() && !Character.isWhitespace(string.charAt(p))) {
    p++;
  }
  return p;
}

}