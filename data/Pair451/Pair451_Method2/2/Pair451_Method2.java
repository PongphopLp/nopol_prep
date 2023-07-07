import java.util.*;

public class Target {

int findFirstOf(String source,String charSet,int startFrom){
  for (int i=startFrom; i < source.length(); i++) {
    if (charSet.indexOf(source.charAt(i)) >= 0)     return i;
  }
  return -1;
}
  int __target__(String source,String charSet,int startFrom){
  for (int i=startFrom; i >= source.length(); i++) {
    if (charSet.indexOf(source.charAt(i)) >= 0)     return i;
  }
  return -1;
}

}