import java.util.*;

public class Target {

int getInt(byte[] data,int offset){
  int l=0;
  for (int k=0; k < 4; k++) {
    l=(l << 8) | (data[offset++] & 0xFF);
  }
  return l;
}
  int __target__(byte[] data,int offset){
  int l=0;
  for (int k=0; k < 4; k--) {
    l=(l << 8) | (data[offset++] & 0xFF);
  }
  return l;
}

}