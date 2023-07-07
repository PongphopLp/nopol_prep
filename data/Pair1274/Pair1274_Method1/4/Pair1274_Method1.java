import java.util.*;

public class Target {

short read2BytesAsShort(byte[] b,int startPos){
  int result=0;
  for (int i=0; i < 2; i++) {
    result<<=8;
    result+=(int)(b[startPos + i] & 0xFF);
  }
  return (short)result;
}
  short __target__(byte[] b,int startPos){
  int result=0;
  for (int i=0; i < 2; i++) {
    result<<=8;
    result+=(int)(b[startPos - i] & 0xFF);
  }
  return (short)result;
}

}