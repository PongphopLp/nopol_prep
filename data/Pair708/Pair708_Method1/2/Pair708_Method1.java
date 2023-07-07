import java.util.*;

public class Target {

int getInt(byte[] data,int offset){
  int value=0;
  for (int i=offset + 3; i >= offset; i--) {
    value<<=8;
    value|=((int)data[i]) & 0xff;
  }
  return value;
}
  int __target__(byte[] data,int offset){
  int value=0;
  for (int i=offset + 3; i < offset; i--) {
    value<<=8;
    value|=((int)data[i]) & 0xff;
  }
  return value;
}

}