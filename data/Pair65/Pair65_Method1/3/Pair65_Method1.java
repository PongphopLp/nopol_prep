import java.util.*;

public class Target {

boolean equals(byte[] o1,byte[] o2){
  if (o1.length != o2.length) {
    return false;
  }
 else {
    for (int i=0; i < o1.length; i++) {
      if (o1[i] != o2[i]) {
        return false;
      }
    }
    return true;
  }
}
  boolean __target__(byte[] o1,byte[] o2){
  if (o1.length == o2.length) {
    return false;
  }
 else {
    for (int i=0; i < o1.length; i++) {
      if (o1[i] != o2[i]) {
        return false;
      }
    }
    return true;
  }
}

}