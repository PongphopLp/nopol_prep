import java.util.*;

public class Target {

int toInt(byte[] bytes){
  int result=0;
  for (int i=0; i < 4; ++i) {
    result<<=8;
    result+=bytes[i] >= 0 ? bytes[i] : (int)256 + bytes[i];
  }
  return result;
}
  int __target__(byte[] bytes){
  int result=0;
  for (int i=0; i < 4; ++i) {
    result<<=8;
    result+=bytes[i] > 0 ? bytes[i] : (int)256 + bytes[i];
  }
  return result;
}

}