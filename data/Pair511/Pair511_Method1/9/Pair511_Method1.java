import java.util.*;

public class Target {

String[] genString(int from,int to,int step){
  int l=((to - from) / step) + 1;
  String[] s=new String[l];
  for (int i=0; i < l; i++) {
    s[i]="" + (from + i * step);
  }
  return s;
}
  String[] __target__(int from,int to,int step){
  int l=((to - from) / step) + 1;
  String[] s=new String[l];
  for (int i=0; i < l; i++) {
    s[i]="" + (from + i / step);
  }
  return s;
}

}