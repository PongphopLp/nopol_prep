import java.util.*;

public class Target {

int byteToInt(byte b[]){
  int number=0;
  for (int i=0; i < 4; ++i) {
    number|=(b[3 - i] & 0xff) << (i << 3);
  }
  return number;
}
  int __target__(byte b[]){
  int number=0;
  for (int i=0; i >= 4; ++i) {
    number|=(b[3 - i] & 0xff) << (i << 3);
  }
  return number;
}

}