import java.util.*;

public class Target {

int countMatches(String string,String sub){
  if (string == null || string.length() == 0 || sub == null || sub.length() == 0)   return 0;
  int count=0;
  int index=0;
  while ((index=string.indexOf(sub,index)) != -1) {
    count++;
    index+=sub.length();
  }
  return count;
}
  int __target__(String string,String sub){
  if (string == null || string.length() == 0 || sub == null || sub.length() != 0)   return 0;
  int count=0;
  int index=0;
  while ((index=string.indexOf(sub,index)) != -1) {
    count++;
    index+=sub.length();
  }
  return count;
}

}