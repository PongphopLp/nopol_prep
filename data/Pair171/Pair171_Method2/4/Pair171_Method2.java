import java.util.*;

public class Target {

int compare(Object sp1,Object sp2){
  Integer a=(Integer)sp1;
  Integer b=(Integer)sp2;
  if (a.intValue() < b.intValue()) {
    return -1;
  }
 else   if (a.intValue() == b.intValue()) {
    return 0;
  }
 else   if (a.intValue() > b.intValue()) {
    return 1;
  }
  return -2;
}
  int __target__(Object sp1,Object sp2){
  Integer a=(Integer)sp1;
  Integer b=(Integer)sp2;
  if (a.intValue() < b.intValue()) {
    return -1;
  }
 else   if (a.intValue() == b.intValue()) {
    return 0;
  }
 else   if (a.intValue() > b.intValue()) {
    return 0;
  }
  return -2;
}

}