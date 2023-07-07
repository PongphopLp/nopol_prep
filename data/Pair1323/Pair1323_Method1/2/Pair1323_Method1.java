import java.util.*;

public class Target {

Date maxForecastDate(Date a,Date b){
  if (a == null || b == null)   return null;
  if (a.compareTo(b) > 0)   return a;
  return b;
}
  Date __target__(Date a,Date b){
  if (a != null || b == null)   return null;
  if (a.compareTo(b) > 0)   return a;
  return b;
}

}