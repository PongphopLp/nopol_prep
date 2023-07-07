import java.util.*;

public class Target {

int toInt(byte[] byte_array_4){
  int ret=0;
  for (int i=0; i < 4; i++) {
    int b=(int)byte_array_4[i];
    if (i < 3 && b < 0) {
      b=256 + b;
    }
    ret+=b << (i * 8);
  }
  return ret;
}
  int __target__(byte[] byte_array_4){
  int ret=0;
  for (int i=0; i < 4; i++) {
    int b=(int)byte_array_4[i];
    if (i <= 3 && b < 0) {
      b=256 + b;
    }
    ret+=b << (i * 8);
  }
  return ret;
}

}