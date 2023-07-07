import java.util.*;

public class Target {

int compareIntAsc(Integer val1,Integer val2){
  if (val1 == null && val2 == null)   return 0;
 else   if (val1 == null)   return 1;
 else   if (val2 == null)   return -1;
 else   if (val1 == val2)   return 0;
 else   if (val1 > val2)   return 1;
 else   if (val1 < val2)   return -1;
  return 0;
}
  int __target__(Integer val1,Integer val2){
  if (val1 == null && val2 == null)   return 0;
 else   if (val1 == null)   return 1;
 else   if (val2 == null)   return -1;
 else   if (val1 == val2)   return 0;
 else   if (val1 > val2)   return 1;
 else   if (val1 >= val2)   return -1;
  return 0;
}

}