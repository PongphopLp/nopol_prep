import java.util.*;

public class Target {

long getLong(byte[] data,int offset){
  long value=0;
  for (int i=offset + 7; i >= offset; i--) {
    value<<=8;
    value|=((long)data[i]) & 0xff;
  }
  return value;
}
  long __target__(byte[] data,int offset){
  long value=0;
  for (int i=offset - 7; i >= offset; i--) {
    value<<=8;
    value|=((long)data[i]) & 0xff;
  }
  return value;
}

}