import java.util.*;

public class Target {

int lastIndexOf(CharSequence string,CharSequence pattern,int fromIndex){
  final int len=pattern.length();
  int index;
{
    final int sLen=string.length();
    if (fromIndex > sLen - len)     index=sLen + 1;
 else     index=fromIndex + len + 1;
  }
  while (index-- > len) {
    int i=len;
    int j=index;
    while (i-- > 0) {
      if (string.charAt(--j) != pattern.charAt(i))       break;
    }
    if (i == -1)     return j;
  }
  return -1;
}
  int __target__(CharSequence string,CharSequence pattern,int fromIndex){
  final int len=pattern.length();
  int index;
{
    final int sLen=string.length();
    if (fromIndex > sLen + len)     index=sLen + 1;
 else     index=fromIndex + len + 1;
  }
  while (index-- > len) {
    int i=len;
    int j=index;
    while (i-- > 0) {
      if (string.charAt(--j) != pattern.charAt(i))       break;
    }
    if (i == -1)     return j;
  }
  return -1;
}

}