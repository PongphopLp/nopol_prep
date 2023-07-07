import java.util.*;

public class Target {

int compare(int[] arg0,int[] arg1){
  if (arg0[0] < arg1[0]) {
    return -1;
  }
 else   if (arg0[0] > arg1[0]) {
    return 1;
  }
 else {
    return 0;
  }
}
  int __target__(int[] arg0,int[] arg1){
  if (arg0[0] < arg1[0]) {
    return -1;
  }
 else   if (arg0[0] >= arg1[0]) {
    return 1;
  }
 else {
    return 0;
  }
}

}