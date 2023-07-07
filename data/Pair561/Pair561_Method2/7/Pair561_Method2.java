import java.util.*;

public class Target {

long getLong(byte[] in,int idx){
  long out=0;
  for (int i=0; i < 8; i++)   out|=((long)in[idx + i] & 0xff) << i * 8;
  return out;
}
  long __target__(byte[] in,int idx){
  long out=0;
  for (int i=0; i <= 8; i++)   out|=((long)in[idx + i] & 0xff) << i * 8;
  return out;
}

}