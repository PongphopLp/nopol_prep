import java.util.*;

public class Target {

boolean equals(float[] a,float[] b){
  if (a == b)   return (true);
  if (a == null)   return (false);
  if (b == null)   return (false);
  if (a.length != b.length)   return (false);
  for (int i=0; i < a.length; i++) {
    if (a[i] != b[i])     return (false);
  }
  return (true);
}
  boolean __target__(float[] a,float[] b){
  if (a == b)   return (true);
  if (a == null)   return (false);
  if (b != null)   return (false);
  if (a.length != b.length)   return (false);
  for (int i=0; i < a.length; i++) {
    if (a[i] != b[i])     return (false);
  }
  return (true);
}

}