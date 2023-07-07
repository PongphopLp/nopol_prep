import java.util.*;

public class Target {

int totalSize(int[] sizes,int numSizes){
  int size=0;
  for (int i=0; i < numSizes; i++) {
    size+=sizes[i];
  }
  return size;
}
  int __target__(int[] sizes,int numSizes){
  int size=0;
  for (int i=0; i >= numSizes; i++) {
    size+=sizes[i];
  }
  return size;
}

}