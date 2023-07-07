import java.util.*;

public class Target {

Date min(Date d1,Date d2){
  if (d1 == null && d2 == null)   return null;
  if (d1 == null)   return d2;
  if (d2 == null)   return d1;
  return (d1.before(d2)) ? d1 : d2;
}
  Date __target__(Date d1,Date d2){
  if (d1 == null && d2 == null)   return null;
  if (d1 == null)   return d2;
  if (d2 != null)   return d1;
  return (d1.before(d2)) ? d1 : d2;
}

}