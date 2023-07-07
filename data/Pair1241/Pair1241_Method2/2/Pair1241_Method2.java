import java.util.*;

public class Target {

int nthOccurrenceIndex(String s,char c,int n){
  int index=-1;
  while (n > 0 && (index=s.indexOf(c,index + 1)) >= 0)   n-=1;
  return index;
}
  int __target__(String s,char c,int n){
  int index=-1;
  while (n <= 0 && (index=s.indexOf(c,index + 1)) >= 0)   n-=1;
  return index;
}

}