import java.util.*;

public class Target {

int indexOfLeast(int[] elements){
  int index=0;
  int least=elements[0];
  for (int i=1; i < elements.length; i++) {
    if (elements[i] < least) {
      index=i;
      least=elements[i];
    }
  }
  return index;
}
  int __target__(int[] elements){
  int index=0;
  int least=elements[0];
  for (int i=1; i < elements.length; i++) {
    if (elements[i] <= least) {
      index=i;
      least=elements[i];
    }
  }
  return index;
}

}