import java.util.*;

public class Target {

boolean sameSenoneSequence(int[] ssid1,int[] ssid2){
  if (ssid1.length == ssid2.length) {
    for (int i=0; i < ssid1.length; i++) {
      if (ssid1[i] != ssid2[i]) {
        return false;
      }
    }
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(int[] ssid1,int[] ssid2){
  if (ssid1.length == ssid2.length) {
    for (int i=0; i <= ssid1.length; i++) {
      if (ssid1[i] != ssid2[i]) {
        return false;
      }
    }
    return true;
  }
 else {
    return false;
  }
}

}