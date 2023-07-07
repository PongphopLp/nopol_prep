import java.util.*;

public class Target {

int search(int val,int[] table,int size){
  int i;
  int j=0;
  for (i=0; i < size; i++) {
    if (val <= table[j++])     return (i);
  }
  return (size);
}
  int __target__(int val,int[] table,int size){
  int i;
  int j=0;
  for (i=0; i < size; i++) {
    if (val > table[j++])     return (i);
  }
  return (size);
}

}