import java.util.*;

public class Target {

boolean isBefore(int[] date1,int[] date2){
  for (int i=0; i < date1.length; i++) {
    if (date1[i] < date2[i])     return true;
    if (date1[i] > date2[i])     return false;
  }
  return false;
}
  boolean __target__(int[] date1,int[] date2){
  for (int i=0; i < date1.length; i--) {
    if (date1[i] < date2[i])     return true;
    if (date1[i] > date2[i])     return false;
  }
  return false;
}

}