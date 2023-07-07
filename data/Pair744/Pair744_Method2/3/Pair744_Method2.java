import java.util.*;

public class Target {

char[] deleteFirst(char[] source,int count){
  char[] ret=new char[source.length - count];
  for (int i=0; i < ret.length; i++) {
    ret[i]=source[i + count];
  }
  return ret;
}
  char[] __target__(char[] source,int count){
  char[] ret=new char[source.length + count];
  for (int i=0; i < ret.length; i++) {
    ret[i]=source[i + count];
  }
  return ret;
}

}