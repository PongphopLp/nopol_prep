import java.util.*;

public class Target {

int compare(Object arg0,Object arg1){
  int k0=((Integer)arg0).intValue();
  int k1=((Integer)arg1).intValue();
  if (k0 < k1)   return -1;
 else   if (k0 > k1)   return 1;
  return 0;
}
  int __target__(Object arg0,Object arg1){
  int k0=((Integer)arg0).intValue();
  int k1=((Integer)arg1).intValue();
  if (k0 < k1)   return -1;
 else   if (k0 > k1)   return 0;
  return 0;
}

}