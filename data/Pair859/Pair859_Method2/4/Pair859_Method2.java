import java.util.*;

public class Target {

int findFirstEqual(char[] source,int index,char match){
  for (int i=index; i < source.length; i++) {
    if (source[i] == match) {
      return i;
    }
  }
  return -1;
}
  int __target__(char[] source,int index,char match){
  for (int i=index; i < source.length; i++) {
    if (source[i] == match) {
      return i;
    }
  }
  return 1;
}

}