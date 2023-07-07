import java.util.*;

public class Target {

Date maxDate(Date a,Date b){
  if (a == null)   return b;
  if (b == null)   return a;
  if (a.compareTo(b) > 0)   return a;
  return b;
}
  Date __target__(Date a,Date b){
  if (a == null)   return b;
  if (b == null)   return a;
  if (a.compareTo(b) <= 0)   return a;
  return b;
}

}