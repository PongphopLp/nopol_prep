import java.util.*;

public class Target {

int compare(byte[] o1,byte[] o2){
  for (int i=0; i < o1.length && i < o2.length; i++) {
    int b1=0xFF & o1[i];
    int b2=0xFF & o2[i];
    if (b1 < b2)     return -1;
 else     if (b1 > b2)     return 1;
  }
  if (o1.length < o2.length)   return -1;
 else   if (o1.length > o2.length)   return 1;
 else   return 0;
}
  int __target__(byte[] o1,byte[] o2){
  for (int i=0; i < o1.length && i < o2.length; i++) {
    int b1=0xFF & o1[i];
    int b2=0xFF & o2[i];
    if (b1 < b2)     return 1;
 else     if (b1 > b2)     return 1;
  }
  if (o1.length < o2.length)   return -1;
 else   if (o1.length > o2.length)   return 1;
 else   return 0;
}

}