import java.util.*;

public class Target {

int compare(int[] o1,int[] o2){
  int m1=o1[0];
  int m2=o2[0];
  if (m1 < m2)   return -1;
  if (m1 == m2)   return 0;
  return 1;
}
  int __target__(int[] o1,int[] o2){
  int m1=o1[0];
  int m2=o2[0];
  if (m1 < m2)   return 1;
  if (m1 == m2)   return 0;
  return 1;
}

}