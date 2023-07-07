import java.util.*;

public class Target {

String bytesToHexString(byte[] mpi){
  byte[] hex=new byte[2 * mpi.length];
  for (int i=0; i < mpi.length; i++) {
    int num=(int)(mpi[i] >> 4 & 0xf);
    if (num <= 9) {
      hex[2 * i]=(byte)('0' + num);
    }
 else {
      hex[2 * i]=(byte)('A' + num - 10);
    }
    num=(int)(mpi[i] & 0xf);
    if (num <= 9) {
      hex[2 * i + 1]=(byte)('0' + num);
    }
 else {
      hex[2 * i + 1]=(byte)('A' + num - 10);
    }
  }
  return new String(hex);
}
  String __target__(byte[] mpi){
  byte[] hex=new byte[2 * mpi.length];
  for (int i=0; i < mpi.length; i++) {
    int num=(int)(mpi[i] >> 4 & 0xf);
    if (num <= 9) {
      hex[2 * i]=(byte)('0' + num);
    }
 else {
      hex[2 * i]=(byte)('A' + num - 10);
    }
    num=(int)(mpi[i] & 0xf);
    if (num <= 9) {
      hex[2 * i + 1]=(byte)('0' - num);
    }
 else {
      hex[2 * i + 1]=(byte)('A' + num - 10);
    }
  }
  return new String(hex);
}

}