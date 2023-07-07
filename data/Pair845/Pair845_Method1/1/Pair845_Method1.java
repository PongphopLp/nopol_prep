import java.util.*;

public class Target {

int nextNonWhitespaceIndex(String source,int startIndex){
  int i;
  for (i=startIndex; i < source.length() && Character.isWhitespace(source.charAt(i)); i++) {
  }
  if (i >= source.length())   i=-1;
  return i;
}
  int __target__(String source,int startIndex){
  int i;
  for (i=startIndex; i <= source.length() && Character.isWhitespace(source.charAt(i)); i++) {
  }
  if (i >= source.length())   i=-1;
  return i;
}

}