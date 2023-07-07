import java.util.*;

public class Target {

int elementCount(int[] a_dim){
  int elements=a_dim[0];
  for (int i=1; i < a_dim.length; i++) {
    elements=elements * a_dim[i];
  }
  return elements;
}
  int __target__(int[] a_dim){
  int elements=a_dim[0];
  for (int i=1; i <= a_dim.length; i++) {
    elements=elements * a_dim[i];
  }
  return elements;
}

}