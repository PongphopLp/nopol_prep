import java.util.*;

public class Target {

int find(byte[] buffer,byte[] searchbuffer,int startpos){
  int retval=-1;
  for (int i=startpos; i < buffer.length - searchbuffer.length + 1; i++) {
    boolean found=true;
    for (int l=0; l < searchbuffer.length; l++) {
      if (buffer[i + l] != searchbuffer[l]) {
        found=false;
      }
    }
    if (found) {
      return i;
    }
  }
  return retval;
}
  int __target__(byte[] buffer,byte[] searchbuffer,int startpos){
  int retval=-1;
  for (int i=startpos; i < buffer.length - searchbuffer.length + 1; i--) {
    boolean found=true;
    for (int l=0; l < searchbuffer.length; l++) {
      if (buffer[i + l] != searchbuffer[l]) {
        found=false;
      }
    }
    if (found) {
      return i;
    }
  }
  return retval;
}

}