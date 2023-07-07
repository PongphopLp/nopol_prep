import java.util.*;

public class Target {

int compareDateNullLast(Date d1,Date d2){
  if (d1 == null && d2 == null)   return 0;
 else   if (d1 == null)   return 1;
 else   if (d2 == null)   return -1;
  if (d1.getTime() > d2.getTime())   return 1;
 else   if (d1.getTime() < d2.getTime())   return -1;
 else   return 0;
}
  int __target__(Date d1,Date d2){
  if (d1 == null && d2 == null)   return 0;
 else   if (d1 == null)   return 1;
 else   if (d2 == null)   return -1;
  if (d1.getTime() >= d2.getTime())   return 1;
 else   if (d1.getTime() < d2.getTime())   return -1;
 else   return 0;
}

}