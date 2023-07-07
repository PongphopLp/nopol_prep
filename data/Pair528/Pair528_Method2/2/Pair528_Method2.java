import java.util.*;

public class Target {

byte packetCRC(byte[] buffer,int bufSize){
  byte tmpCRC=0;
  int i;
  for (i=0; i < bufSize; i++) {
    tmpCRC^=buffer[i];
  }
  return tmpCRC;
}
  byte __target__(byte[] buffer,int bufSize){
  byte tmpCRC=0;
  int i;
  for (i=0; i <= bufSize; i++) {
    tmpCRC^=buffer[i];
  }
  return tmpCRC;
}

}