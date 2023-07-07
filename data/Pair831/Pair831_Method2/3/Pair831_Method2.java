import java.util.*;

public class Target {

boolean equalsChv(byte[] chv1,byte[] chv2,int pos2){
  for (int i=0; i < chv1.length; i++) {
    if (chv1[i] != chv2[pos2 + i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(byte[] chv1,byte[] chv2,int pos2){
  for (int i=0; i < chv1.length; i++) {
    if (chv1[i] != chv2[pos2 - i]) {
      return false;
    }
  }
  return true;
}

}