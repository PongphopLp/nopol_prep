import java.util.*;

public class Target {

short bytesToShort(byte[] bytes,int offset){
  short result=0x0000;
  int end=offset + 2;
  for (int i=0; i < 2; i++) {
    result|=(bytes[end - i - 1] & 0xff) << (8 * i);
  }
  return result;
}
  short __target__(byte[] bytes,int offset){
  short result=0x0000;
  int end=offset + 2;
  for (int i=0; i <= 2; i++) {
    result|=(bytes[end - i - 1] & 0xff) << (8 * i);
  }
  return result;
}

}