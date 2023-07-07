import java.util.*;

public class Target {

boolean startsWith(byte a[],byte b[]){
  if (a.length < b.length)   return false;
  for (int i=0; i < b.length; i++) {
    if (a[i] != b[i])     return false;
  }
  return true;
}
  boolean __target__(byte a[],byte b[]){
  if (a.length < b.length)   return false;
  for (int i=0; i <= b.length; i++) {
    if (a[i] != b[i])     return false;
  }
  return true;
}

}