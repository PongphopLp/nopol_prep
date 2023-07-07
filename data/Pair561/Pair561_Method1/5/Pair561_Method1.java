import java.util.*;

public class Target {

long getLong(byte[] data,int offset){
  long result=0;
  int i=offset;
  for (int shiftBy=0; shiftBy < 64; shiftBy+=8) {
    result|=((long)(data[i] & 0xff)) << shiftBy;
    ++i;
  }
  return result;
}
  long __target__(byte[] data,int offset){
  long result=0;
  int i=offset;
  for (int shiftBy=0; shiftBy <= 64; shiftBy+=8) {
    result|=((long)(data[i] & 0xff)) << shiftBy;
    ++i;
  }
  return result;
}

}