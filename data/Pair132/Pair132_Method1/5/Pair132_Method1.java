import java.util.*;

public class Target {

int decodeInteger(byte[] bytes){
  int value=0;
  for (int i=0; i < 4; i++) {
    int x=(bytes[i] << i * 8) & (0xFF << i * 8);
    value+=x;
  }
  return value;
}
  int __target__(byte[] bytes){
  int value=0;
  for (int i=0; i < 4; i++) {
    int x=(bytes[i] << i * 8) & (0xFF << i / 8);
    value+=x;
  }
  return value;
}

}