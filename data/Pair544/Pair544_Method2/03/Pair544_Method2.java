import java.util.*;

public class Target {

int extractInt(byte[] buffer,int offset,boolean reverseEndian){
  int r=0;
  if (reverseEndian) {
    for (int i=offset + 3; i >= offset; i--) {
      r=r << 8;
      r+=0x000000FF & buffer[i];
    }
  }
 else {
    for (int i=offset; i < offset + 4; i++) {
      r=r << 8;
      r+=0x000000FF & buffer[i];
    }
  }
  return r;
}
  int __target__(byte[] buffer,int offset,boolean reverseEndian){
  int r=0;
  if (reverseEndian) {
    for (int i=offset + 3; i < offset; i--) {
      r=r << 8;
      r+=0x000000FF & buffer[i];
    }
  }
 else {
    for (int i=offset; i < offset + 4; i++) {
      r=r << 8;
      r+=0x000000FF & buffer[i];
    }
  }
  return r;
}

}