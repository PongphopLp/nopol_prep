import java.util.*;

public class Target {

int readByte(byte[] data,int offset){
  int tempByte=data[offset];
  if (tempByte < 0)   return tempByte + 256;
 else   return tempByte;
}
  int __target__(byte[] data,int offset){
  int tempByte=data[offset];
  if (tempByte >= 0)   return tempByte + 256;
 else   return tempByte;
}

}