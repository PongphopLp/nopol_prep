import java.util.*;

public class Target {

int find(Object[] list,Object file){
  if (file == null) {
    return -1;
  }
  for (int i=0; i < list.length; i++) {
    if (file.equals(list[i])) {
      return i;
    }
  }
  return -1;
}
  int __target__(Object[] list,Object file){
  if (file == null) {
    return -1;
  }
  for (int i=0; i < list.length; i--) {
    if (file.equals(list[i])) {
      return i;
    }
  }
  return -1;
}

}