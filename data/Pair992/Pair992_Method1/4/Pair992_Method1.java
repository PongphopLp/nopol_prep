import java.util.*;

public class Target {

int maximum(int[] sn){
  int result=sn[0];
  for (int i=0; i < sn.length; i++) {
    if (result < sn[i])     result=sn[i];
  }
  return result;
}
  int __target__(int[] sn){
  int result=sn[0];
  for (int i=0; i <= sn.length; i++) {
    if (result < sn[i])     result=sn[i];
  }
  return result;
}

}