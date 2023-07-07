import java.util.*;

public class Target {

int find(int[] data,int key){
  int low=0, high=data.length - 1;
  while (low <= high) {
    final int i=(low + high) >> 1;
    final int v=data[i];
    if (v == key)     return i;
 else     if (v < key)     low=i + 1;
 else     high=i - 1;
  }
  return -1;
}
  int __target__(int[] data,int key){
  int low=0, high=data.length - 1;
  while (low <= high) {
    final int i=(low + high) >> 1;
    final int v=data[i];
    if (v == key)     return i;
 else     if (v >= key)     low=i + 1;
 else     high=i - 1;
  }
  return -1;
}

}