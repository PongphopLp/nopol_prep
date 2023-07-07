import java.util.*;

public class Target {

boolean equalDates(Calendar c1,Calendar c2){
  if (c1.get(Calendar.DATE) == c2.get(Calendar.DATE) && c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH) && c1.get(Calendar.YEAR) == c2.get(Calendar.YEAR)) {
    return true;
  }
  return false;
}
  boolean __target__(Calendar c1,Calendar c2){
  if (c1.get(Calendar.DATE) == c2.get(Calendar.DATE) && c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH) && c1.get(Calendar.YEAR) != c2.get(Calendar.YEAR)) {
    return true;
  }
  return false;
}

}