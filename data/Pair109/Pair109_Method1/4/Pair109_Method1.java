import java.util.*;

public class Target {

boolean compare(byte[] bytea,byte[] byteb){
  boolean equal=true;
  if (bytea.length == byteb.length) {
    for (int i=0; i < bytea.length; i++) {
      if (bytea[i] != byteb[i]) {
        equal=false;
        break;
      }
    }
  }
 else {
    equal=false;
  }
  return equal;
}
  boolean __target__(byte[] bytea,byte[] byteb){
  boolean equal=true;
  if (bytea.length == byteb.length) {
    for (int i=0; i < bytea.length; i++) {
      if (bytea[i] == byteb[i]) {
        equal=false;
        break;
      }
    }
  }
 else {
    equal=false;
  }
  return equal;
}

}