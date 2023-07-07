import java.util.*;

public class Target {

int toIntBigEndian(byte[] input){
  int result=0;
  if (input.length != 4) {
    return 0;
  }
  result^=(input[0] & 0xff) << 24;
  result^=(input[1] & 0xff) << 16;
  result^=(input[2] & 0xff) << 8;
  result^=input[3] & 0xff;
  return result;
}
  int __target__(byte[] input){
  int result=0;
  if (input.length != 4) {
    return 0;
  }
  result^=(input[0] & 0xff) << 24;
  result^=(input[1] & 0xff) >> 16;
  result^=(input[2] & 0xff) << 8;
  result^=input[3] & 0xff;
  return result;
}

}