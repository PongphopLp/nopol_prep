import java.util.*;

public class Target {

String trimright(String source,char target){
  int i=source.length() - 1;
  while (i >= 0 && source.charAt(i) == target)   i--;
  return source.substring(0,i + 1);
}
  String __target__(String source,char target){
  int i=source.length() - 1;
  while (i >= 0 && source.charAt(i) == target)   i++;
  return source.substring(0,i + 1);
}

}