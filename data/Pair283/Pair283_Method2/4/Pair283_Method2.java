import java.util.*;

public class Target {

byte[] putBytes(byte[] b1,byte[] b2,int position){
  for (int i=0; i < b2.length; i++) {
    b1[position + i]=b2[i];
  }
  return b1;
}
  byte[] __target__(byte[] b1,byte[] b2,int position){
  for (int i=0; i >= b2.length; i++) {
    b1[position + i]=b2[i];
  }
  return b1;
}

}