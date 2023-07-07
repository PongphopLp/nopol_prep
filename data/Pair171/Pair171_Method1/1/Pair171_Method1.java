import java.util.*;

public class Target {

int compare(Object obj,Object obj1){
  int v1=((Integer)obj).intValue();
  int v2=((Integer)obj1).intValue();
  if (v1 < v2)   return -1;
  if (v1 == v2)   return 0;
  return 1;
}
  int __target__(Object obj,Object obj1){
  int v1=((Integer)obj).intValue();
  int v2=((Integer)obj1).intValue();
  if (v1 >= v2)   return -1;
  if (v1 == v2)   return 0;
  return 1;
}

}