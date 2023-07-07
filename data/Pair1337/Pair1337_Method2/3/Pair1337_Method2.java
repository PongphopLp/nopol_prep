import java.util.*;

public class Target {

int compareDates(Calendar c1,Calendar c2){
  int vDiff=c1.get(Calendar.YEAR) - c2.get(Calendar.YEAR);
  if (vDiff != 0)   return vDiff;
  if ((vDiff=c1.get(Calendar.MONTH) - c2.get(Calendar.MONTH)) != 0)   return vDiff;
  return c1.get(Calendar.DAY_OF_MONTH) - c2.get(Calendar.DAY_OF_MONTH);
}
  int __target__(Calendar c1,Calendar c2){
  int vDiff=c1.get(Calendar.YEAR) - c2.get(Calendar.YEAR);
  if (vDiff != 0)   return vDiff;
  if ((vDiff=c1.get(Calendar.MONTH) - c2.get(Calendar.MONTH)) != 0)   return vDiff;
  return c1.get(Calendar.DAY_OF_MONTH) + c2.get(Calendar.DAY_OF_MONTH);
}

}