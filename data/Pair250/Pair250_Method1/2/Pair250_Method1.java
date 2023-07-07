import java.util.*;

public class Target {

int compare(Object o1,Object o2){
  Integer i1=(Integer)o1;
  Integer i2=(Integer)o2;
  if (i1.intValue() < i2.intValue()) {
    return -1;
  }
 else   if (i1.intValue() == i2.intValue()) {
    return 0;
  }
  return 1;
}
  int __target__(Object o1,Object o2){
  Integer i1=(Integer)o1;
  Integer i2=(Integer)o2;
  if (i1.intValue() < i2.intValue()) {
    return -1;
  }
 else   if (i1.intValue() != i2.intValue()) {
    return 0;
  }
  return 1;
}

}