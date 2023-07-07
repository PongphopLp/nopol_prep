import java.util.*;

public class Target {

String trim(String src,char d){
  int st=0;
  int len=src.length() - 1;
  while (st < len && src.charAt(st) == d) {
    st++;
  }
  while (len > st && src.charAt(len) == d) {
    len--;
  }
  return src.substring(st,len + 1);
}
  String __target__(String src,char d){
  int st=0;
  int len=src.length() - 1;
  while (st < len && src.charAt(st) == d) {
    st++;
  }
  while (len > st && src.charAt(len) == d) {
    len--;
  }
  return src.substring(st,len - 1);
}

}