import java.util.*;

public class Target {

boolean compare(byte[] d1,byte[] d2,int o){
  for (int i=0; i < d1.length; i++) {
    if (i + o >= d2.length)     return false;
    if (d1[i] != d2[o + i])     return false;
  }
  return true;
}
  boolean __target__(byte[] d1,byte[] d2,int o){
  for (int i=0; i < d1.length; i++) {
    if (i + o >= d2.length)     return false;
    if (d1[i] == d2[o + i])     return false;
  }
  return true;
}

}