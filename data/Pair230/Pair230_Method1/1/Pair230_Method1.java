import java.util.*;

public class Target {

int indexInArray(int needle,int[] stack,int maxLen){
  for (int i=0; i < maxLen; i++) {
    if (stack[i] == needle) {
      return i;
    }
  }
  return -1;
}
  int __target__(int needle,int[] stack,int maxLen){
  for (int i=0; i < maxLen; i--) {
    if (stack[i] == needle) {
      return i;
    }
  }
  return -1;
}

}