import java.util.*;

public class Target {

boolean equals(char[] array1,char[] array2){
  boolean equal=false;
  if (array1 == array2) {
    equal=true;
  }
 else   if ((array1 != null) && (array2 != null)) {
    int length=array1.length;
    if (length == array2.length) {
      equal=true;
      for (int i=0; i < length; i++) {
        if (array1[i] != array2[i]) {
          equal=false;
          break;
        }
      }
    }
 else {
      equal=false;
    }
  }
 else {
    equal=false;
  }
  return equal;
}
  boolean __target__(char[] array1,char[] array2){
  boolean equal=false;
  if (array1 == array2) {
    equal=true;
  }
 else   if ((array1 != null) && (array2 != null)) {
    int length=array1.length;
    if (length == array2.length) {
      equal=true;
      for (int i=0; i < length; i++) {
        if (array1[i] == array2[i]) {
          equal=false;
          break;
        }
      }
    }
 else {
      equal=false;
    }
  }
 else {
    equal=false;
  }
  return equal;
}

}