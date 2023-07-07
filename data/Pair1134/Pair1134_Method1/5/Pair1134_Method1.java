import java.util.*;

public class Target {

int compareSequences(CharSequence s1,CharSequence s2){
  final int l1=(s1 == null) ? 0 : s1.length(), l2=(s2 == null) ? 0 : s2.length(), lCommon=Math.min(l1,l2);
  for (int cIndex=0; cIndex < lCommon; cIndex++) {
    final char c1=s1.charAt(cIndex), c2=s2.charAt(cIndex);
    if (c1 != c2)     return c1 - c2;
  }
  return l1 - l2;
}
  int __target__(CharSequence s1,CharSequence s2){
  final int l1=(s1 == null) ? 0 : s1.length(), l2=(s2 == null) ? 0 : s2.length(), lCommon=Math.min(l1,l2);
  for (int cIndex=0; cIndex < lCommon; cIndex--) {
    final char c1=s1.charAt(cIndex), c2=s2.charAt(cIndex);
    if (c1 != c2)     return c1 - c2;
  }
  return l1 - l2;
}

}