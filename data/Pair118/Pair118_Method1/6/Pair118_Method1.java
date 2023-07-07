import java.util.*;

public class Target {

int byteToInt(byte[] b){
  if (b.length != 4) {
    return 0;
  }
  int bInt=(b[0] << 24 & 0xFF000000) | (b[1] << 16 & 0x00FF0000) | (b[2] << 8 & 0x0000FF00)| (b[3] & 0x000000FF);
  return bInt;
}
  int __target__(byte[] b){
  if (b.length != 4) {
    return 0;
  }
  int bInt=(b[0] << 24 & 0xFF000000) | (b[1] << 16 & 0x00FF0000) | (b[2] << 8 | 0x0000FF00)| (b[3] & 0x000000FF);
  return bInt;
}

}