import java.util.*;

public class Target {

boolean equals(byte[] tom,byte[] jerry){
  boolean b=true;
  if (tom.length != jerry.length) {
    b=false;
  }
 else {
    for (int i=0; i < tom.length; i++) {
      if (tom[i] != jerry[i]) {
        b=false;
        break;
      }
    }
  }
  return b;
}
  boolean __target__(byte[] tom,byte[] jerry){
  boolean b=true;
  if (tom.length != jerry.length) {
    b=false;
  }
 else {
    for (int i=0; i < tom.length; i++) {
      if (tom[i] == jerry[i]) {
        b=false;
        break;
      }
    }
  }
  return b;
}

}