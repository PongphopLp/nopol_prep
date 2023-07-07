import java.util.*;

public class Target {

int get16u(byte[] data,int offset,boolean littleEndian){
  int a=data[offset] & 0xFF;
  int b=data[offset + 1] & 0xFF;
  if (littleEndian)   return ((b << 8) | a);
 else   return ((a << 8) | b);
}
  int __target__(byte[] data,int offset,boolean littleEndian){
  int a=data[offset] & 0xFF;
  int b=data[offset + 1] & 0xFF;
  if (littleEndian)   return ((b << 8) | a);
 else   return ((a << 8) & b);
}

}