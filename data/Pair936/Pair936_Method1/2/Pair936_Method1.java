import java.util.*;

public class Target {

int skipQuote(String str,int i){
  if (i < str.length() && (str.charAt(i) == '\'' || str.charAt(i) == '"')) {
    i++;
  }
  return i;
}
  int __target__(String str,int i){
  if (i < str.length() && (str.charAt(i) != '\'' || str.charAt(i) == '"')) {
    i++;
  }
  return i;
}

}