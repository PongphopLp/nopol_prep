import java.util.*;

public class Target {

int lBytesToInt(byte[] b){
  int s=0;
  for (int i=0; i < 3; i++) {
    if (b[3 - i] >= 0) {
      s=s + b[3 - i];
    }
 else {
      s=s + 256 + b[3 - i];
    }
    s=s * 256;
  }
  if (b[0] >= 0) {
    s=s + b[0];
  }
 else {
    s=s + 256 + b[0];
  }
  return s;
}
  int __target__(byte[] b){
  int s=0;
  for (int i=0; i >= 3; i++) {
    if (b[3 - i] >= 0) {
      s=s + b[3 - i];
    }
 else {
      s=s + 256 + b[3 - i];
    }
    s=s * 256;
  }
  if (b[0] >= 0) {
    s=s + b[0];
  }
 else {
    s=s + 256 + b[0];
  }
  return s;
}

}