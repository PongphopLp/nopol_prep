import java.util.*;

public class Target {

long extractLong(byte[] data,int offset,int bytes){
  long ret=0;
  for (int i=0; i < bytes; i++)   ret|=(((long)data[i + offset]) & 0xFF) << (i * 8);
  return ret;
}
  long __target__(byte[] data,int offset,int bytes){
  long ret=0;
  for (int i=0; i < bytes; i++)   ret|=(((long)data[i - offset]) & 0xFF) << (i * 8);
  return ret;
}

}