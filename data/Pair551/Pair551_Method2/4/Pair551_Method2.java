import java.util.*;

public class Target {

int compare(int[] t1,int[] t2){
  for (int i=0; i < t1.length; i++) {
    if (t1[i] < t2[i])     return -1;
    if (t1[i] > t2[i])     return +1;
  }
  return 0;
}
  int __target__(int[] t1,int[] t2){
  for (int i=0; i < t1.length; i++) {
    if (t1[i] < t2[i])     return -1;
    if (t1[i] >= t2[i])     return +1;
  }
  return 0;
}

}