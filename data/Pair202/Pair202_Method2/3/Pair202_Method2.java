import java.util.*;

public class Target {

int compare(Object o1,Object o2){
  Calendar c1=(Calendar)o1;
  Calendar c2=(Calendar)o2;
  long t1=c1.getTime().getTime();
  long t2=c2.getTime().getTime();
  if (t1 < t2)   return -1;
 else   if (t1 > t2)   return 1;
 else   return 0;
}
  int __target__(Object o1,Object o2){
  Calendar c1=(Calendar)o1;
  Calendar c2=(Calendar)o2;
  long t1=c1.getTime().getTime();
  long t2=c2.getTime().getTime();
  if (t1 < t2)   return -1;
 else   if (t1 >= t2)   return 1;
 else   return 0;
}

}