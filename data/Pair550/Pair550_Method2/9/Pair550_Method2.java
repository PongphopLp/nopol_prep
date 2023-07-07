import java.util.*;

public class Target {

int compareToInts(int[] i1,int[] i2){
  int minLength=Math.min(i1.length,i2.length);
  for (int i=0; i < minLength; i++) {
    int i3=i1[i] < i2[i] ? -1 : (i1[i] == i2[i] ? 0 : 1);
    if (i3 != 0)     return i3;
  }
  return i1.length - i2.length;
}
  int __target__(int[] i1,int[] i2){
  int minLength=Math.min(i1.length,i2.length);
  for (int i=0; i < minLength; i++) {
    int i3=i1[i] < i2[i] ? -1 : (i1[i] == i2[i] ? 0 : 1);
    if (i3 == 0)     return i3;
  }
  return i1.length - i2.length;
}

}