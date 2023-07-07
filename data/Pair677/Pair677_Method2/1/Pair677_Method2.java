import java.util.*;

public class Target {

int readIntFromBuffer(byte[] buff,int startPos){
  int res=0;
  for (int i=0; i < 4; i++)   res|=((buff[startPos + i] & 0xff) << (i * 8));
  return res;
}
  int __target__(byte[] buff,int startPos){
  int res=0;
  for (int i=0; i >= 4; i++)   res|=((buff[startPos + i] & 0xff) << (i * 8));
  return res;
}

}