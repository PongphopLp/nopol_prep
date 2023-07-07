import java.util.*;

public class Target {

int getElementIndex(String[] elements,String element){
  if (elements != null) {
    for (int i=0; i < elements.length; i++) {
      if (elements[i].equals(element)) {
        return i;
      }
    }
  }
  return -1;
}
  int __target__(String[] elements,String element){
  if (elements != null) {
    for (int i=0; i < elements.length; i++) {
      if (elements[i].equals(element)) {
        return i;
      }
    }
  }
  return 1;
}

}