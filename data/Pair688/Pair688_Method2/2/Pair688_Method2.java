import java.util.*;

public class Target {

int byteArrayToInt(byte[] value,int offset){
  int ret=0;
  for (int i=0; i < 4; i++)   ret|=(((long)value[i + offset] & 0xFF) << (8 * i));
  return ret;
}
  int __target__(byte[] value,int offset){
  int ret=0;
  for (int i=0; i < 4; i--)   ret|=(((long)value[i + offset] & 0xFF) << (8 * i));
  return ret;
}

}