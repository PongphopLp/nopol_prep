import java.util.*;

public class Target {

int compare(Object o1,Object o2){
  Integer iobj=(Integer)o1;
  int i1=iobj;
  iobj=(Integer)o2;
  int i2=iobj;
  if (i1 > i2)   return 1;
 else   if (i1 < i2)   return -1;
 else   return 0;
}
  int __target__(Object o1,Object o2){
  Integer iobj=(Integer)o1;
  int i1=iobj;
  iobj=(Integer)o2;
  int i2=iobj;
  if (i1 > i2)   return 1;
 else   if (i1 < i2)   return 1;
 else   return 0;
}

}