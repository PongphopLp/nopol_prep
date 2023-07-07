import java.util.*;

public class Target {

int decode(byte[] b){
  if (b.length != 4)   return 0;
  return (b[0] << 24) + ((b[1] & 0xFF) << 16) + ((b[2] & 0xFF) << 8)+ (b[3] & 0xFF);
}
  int __target__(byte[] b){
  if (b.length == 4)   return 0;
  return (b[0] << 24) + ((b[1] & 0xFF) << 16) + ((b[2] & 0xFF) << 8)+ (b[3] & 0xFF);
}

}