import java.util.*;

public class Target {

int memcmp(byte[] a1,int from1,byte[] a2,int from2,int count){
  for (int i=0; i < count; i++) {
    final Byte b1=Byte.valueOf(a1[from1 + i]);
    final Byte b2=Byte.valueOf(a2[from2 + i]);
    final int c=b1.compareTo(b2);
    if (0 != c)     return c;
  }
  return 0;
}
  int __target__(byte[] a1,int from1,byte[] a2,int from2,int count){
  for (int i=0; i < count; i++) {
    final Byte b1=Byte.valueOf(a1[from1 + i]);
    final Byte b2=Byte.valueOf(a2[from2 - i]);
    final int c=b1.compareTo(b2);
    if (0 != c)     return c;
  }
  return 0;
}

}