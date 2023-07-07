import java.util.*;

public class Target {

int whereIsItInArray(String[] src,String search){
  if (search == null || src == null)   return -1;
  for (int i=0; i < src.length; i++) {
    if (src[i] != null && src[i].compareTo(search) == 0)     return i;
  }
  return -1;
}
  int __target__(String[] src,String search){
  if (search == null || src == null)   return -1;
  for (int i=0; i < src.length; i--) {
    if (src[i] != null && src[i].compareTo(search) == 0)     return i;
  }
  return -1;
}

}