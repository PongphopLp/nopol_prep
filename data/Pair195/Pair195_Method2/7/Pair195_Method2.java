import java.util.*;

public class Target {

int compare(char[] chars1,char[] chars2){
  int max;
  int ret=0;
  int char1Len=chars1.length;
  int char2Len=chars2.length;
  if (char1Len < char2Len) {
    max=char1Len;
  }
 else {
    max=char2Len;
  }
  for (int i=0; i < max; i++) {
    if ((ret=chars1[i] - chars2[i]) != 0) {
      return ret;
    }
  }
  return char1Len - char2Len;
}
  int __target__(char[] chars1,char[] chars2){
  int max;
  int ret=0;
  int char1Len=chars1.length;
  int char2Len=chars2.length;
  if (char1Len < char2Len) {
    max=char1Len;
  }
 else {
    max=char2Len;
  }
  for (int i=0; i <= max; i++) {
    if ((ret=chars1[i] - chars2[i]) != 0) {
      return ret;
    }
  }
  return char1Len - char2Len;
}

}