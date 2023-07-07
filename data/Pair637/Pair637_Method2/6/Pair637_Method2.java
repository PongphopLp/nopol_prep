import java.util.*;

public class Target {

int getInt(byte[] data,int offset){
  int res=0;
  for (int i=0; i < 4; i++) {
    res=(res << 8) | (data[offset + i] & 0xff);
  }
  return res;
}
  int __target__(byte[] data,int offset){
  int res=0;
  for (int i=0; i >= 4; i++) {
    res=(res << 8) | (data[offset + i] & 0xff);
  }
  return res;
}

}