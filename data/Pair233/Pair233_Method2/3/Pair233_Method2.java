import java.util.*;

public class Target {

boolean increment(int[] coords,int[] sizes){
  int i;
  for (i=coords.length - 1; ; i--) {
    if (coords[i] + 1 >= sizes[i]) {
      if (i == 0)       return false;
      coords[i]=0;
    }
 else {
      coords[i]++;
      return true;
    }
  }
}
  boolean __target__(int[] coords,int[] sizes){
  int i;
  for (i=coords.length - 1; ; i++) {
    if (coords[i] + 1 >= sizes[i]) {
      if (i == 0)       return false;
      coords[i]=0;
    }
 else {
      coords[i]++;
      return true;
    }
  }
}

}