import java.util.*;

public class Target {

int compare(int[] ca,int[] cb){
  for (int i=0; i < ca.length; i++)   if (ca[i] < cb[i])   return -1;
 else   if (ca[i] > cb[i])   return 1;
  return 0;
}
  int __target__(int[] ca,int[] cb){
  for (int i=0; i < ca.length; i++)   if (ca[i] >= cb[i])   return -1;
 else   if (ca[i] > cb[i])   return 1;
  return 0;
}

}