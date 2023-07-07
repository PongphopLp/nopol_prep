import java.util.*;

public class Target {

int compare(Object o1,Object o2){
  int res;
  if ((Double)o1 > (Double)o2) {
    res=1;
  }
 else   if ((Double)o1 < (Double)o2) {
    res=-1;
  }
 else {
    res=0;
  }
  return res;
}
  int __target__(Object o1,Object o2){
  int res;
  if ((Double)o1 > (Double)o2) {
    res=1;
  }
 else   if ((Double)o1 < (Double)o2) {
    res=1;
  }
 else {
    res=0;
  }
  return res;
}

}