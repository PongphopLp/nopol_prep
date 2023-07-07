import java.util.*;

public class Target {

Date getSmallestDate(Date date1,Date date2){
  if (date1 == null)   return date2;
 else   if (date2 == null)   return date1;
 else   if (date1.getTime() > date2.getTime())   return date2;
 else   if (date1.getTime() < date2.getTime())   return date1;
 else   return date1;
}
  Date __target__(Date date1,Date date2){
  if (date1 == null)   return date2;
 else   if (date2 != null)   return date1;
 else   if (date1.getTime() > date2.getTime())   return date2;
 else   if (date1.getTime() < date2.getTime())   return date1;
 else   return date1;
}

}