import java.util.*;

public class Target {

int byteToInteger(byte[] raw,boolean reverse){
  int[] fix=new int[2];
  fix[0]=raw[0] < 0 ? 256 + raw[0] : raw[0];
  fix[1]=raw[1] < 0 ? 256 + raw[1] : raw[1];
  if (reverse) {
    return (fix[1] << 8) + fix[0];
  }
 else {
    return (fix[0] << 8) + fix[1];
  }
}
  int __target__(byte[] raw,boolean reverse){
  int[] fix=new int[2];
  fix[0]=raw[0] < 0 ? 256 - raw[0] : raw[0];
  fix[1]=raw[1] < 0 ? 256 + raw[1] : raw[1];
  if (reverse) {
    return (fix[1] << 8) + fix[0];
  }
 else {
    return (fix[0] << 8) + fix[1];
  }
}

}