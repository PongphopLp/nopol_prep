import java.util.*;

public class Target {

int hamming(int[] s1,int[] s2){
  if (s1.length != s2.length)   return -1;
  int counter=0;
  for (int k=0; k < s1.length; ++k)   if (s1[k] != s2[k])   ++counter;
  return counter;
}
  int __target__(int[] s1,int[] s2){
  if (s1.length != s2.length)   return 1;
  int counter=0;
  for (int k=0; k < s1.length; ++k)   if (s1[k] != s2[k])   ++counter;
  return counter;
}

}