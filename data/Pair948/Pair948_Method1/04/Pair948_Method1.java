import java.util.*;

public class Target {

int compareDateNewBeforeNullLast(Date date1,Date date2){
  if (date1 == null && date2 == null)   return 0;
 else   if (date1 == null)   return 1;
 else   if (date2 == null)   return -1;
  if ((date1 != null ? date1.getTime() : 0) > (date2 != null ? date2.getTime() : 0))   return -1;
 else   if ((date1 != null ? date1.getTime() : 0) < (date2 != null ? date2.getTime() : 0))   return 1;
 else   return 0;
}
  int __target__(Date date1,Date date2){
  if (date1 == null && date2 != null)   return 0;
 else   if (date1 == null)   return 1;
 else   if (date2 == null)   return -1;
  if ((date1 != null ? date1.getTime() : 0) > (date2 != null ? date2.getTime() : 0))   return -1;
 else   if ((date1 != null ? date1.getTime() : 0) < (date2 != null ? date2.getTime() : 0))   return 1;
 else   return 0;
}

}