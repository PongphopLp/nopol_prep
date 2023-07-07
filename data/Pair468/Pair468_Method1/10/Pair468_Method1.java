import java.util.*;

public class Target {

int getParent(int index,int[] encodedTree){
  while (index >= 0 && encodedTree[index] >= -1) {
    index--;
  }
  if (index < 0) {
    return -1;
  }
 else {
    return index + encodedTree[index];
  }
}
  int __target__(int index,int[] encodedTree){
  while (index >= 0 && encodedTree[index] >= -1) {
    index--;
  }
  if (index <= 0) {
    return -1;
  }
 else {
    return index + encodedTree[index];
  }
}

}