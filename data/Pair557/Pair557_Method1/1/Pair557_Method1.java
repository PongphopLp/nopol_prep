import java.util.*;

public class Target {

int compare(int[] i1,int[] i2){
  if (i1.length != i2.length)   return i1.length - i2.length;
  for (int i=0; i < i1.length; ++i)   if (i1[i] != i2[i])   return i1[i] - i2[i];
  return 0;
}
  int __target__(int[] i1,int[] i2){
  if (i1.length != i2.length)   return i1.length - i2.length;
  for (int i=0; i < i1.length; --i)   if (i1[i] != i2[i])   return i1[i] - i2[i];
  return 0;
}

}