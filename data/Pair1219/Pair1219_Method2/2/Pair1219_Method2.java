import java.util.*;

public class Target {

int indexOf(char[] chars,int length,char chr,int from){
  while ((from < length) && (chars[from] != chr)) {
    ++from;
  }
  return from;
}
  int __target__(char[] chars,int length,char chr,int from){
  while ((from >= length) && (chars[from] != chr)) {
    ++from;
  }
  return from;
}

}