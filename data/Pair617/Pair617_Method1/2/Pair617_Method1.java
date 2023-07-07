import java.util.*;

public class Target {

boolean compare(int[] charBarWidths,int[] candidate,int n){
  for (int i=0; i < n; i++) {
    if (charBarWidths[i] != candidate[i])     return false;
  }
  return true;
}
  boolean __target__(int[] charBarWidths,int[] candidate,int n){
  for (int i=0; i < n; i++) {
    if (charBarWidths[i] == candidate[i])     return false;
  }
  return true;
}

}