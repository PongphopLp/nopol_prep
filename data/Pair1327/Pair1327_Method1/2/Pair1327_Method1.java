import java.util.*;

public class Target {

boolean equals(byte a[],byte b[]){
  if (a.length != b.length)   return false;
  for (int i=0; i < a.length; i++) {
    if (a[i] != b[i])     return false;
  }
  return true;
}
  boolean __target__(byte a[],byte b[]){
  if (a.length != b.length)   return false;
  for (int i=0; i <= a.length; i++) {
    if (a[i] != b[i])     return false;
  }
  return true;
}

}