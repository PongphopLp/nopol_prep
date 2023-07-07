import java.util.*;

public class Target {

int readLittleEndian(byte[] data,int pos,int size){
  int retVal=0;
  int shifter=0;
  while (size > 0) {
    retVal+=(data[pos] & 0xff) << shifter;
    shifter+=8;
    pos++;
    size--;
  }
  return retVal;
}
  int __target__(byte[] data,int pos,int size){
  int retVal=0;
  int shifter=0;
  while (size >= 0) {
    retVal+=(data[pos] & 0xff) << shifter;
    shifter+=8;
    pos++;
    size--;
  }
  return retVal;
}

}