import java.util.*;

public class Target {

int countOccurrencesOf(String str,String sub){
  if (str == null || sub == null || str.length() == 0 || sub.length() == 0) {
    return 0;
  }
  int count=0;
  int pos=0;
  int idx;
  while ((idx=str.indexOf(sub,pos)) != -1) {
    ++count;
    pos=idx + sub.length();
  }
  return count;
}
  int __target__(String str,String sub){
  if (str == null || sub == null || str.length() == 0 || sub.length() == 0) {
    return 0;
  }
  int count=0;
  int pos=0;
  int idx;
  while ((idx=str.indexOf(sub,pos)) != -1) {
    --count;
    pos=idx + sub.length();
  }
  return count;
}

}