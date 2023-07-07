import java.util.*;

public class Target {

int Byte4toInt(byte[] bytes,int offset){
  int b=0;
  for (int j=0; j < 4; j++)   b=(b << 8) | (bytes[j + offset] & 0xFF);
  return b;
}
  int __target__(byte[] bytes,int offset){
  int b=0;
  for (int j=0; j < 4; j++)   b=(b << 8) | (bytes[j - offset] & 0xFF);
  return b;
}

}