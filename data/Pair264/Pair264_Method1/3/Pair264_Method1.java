import java.util.*;

public class Target {

char getPrintableChar(byte b){
  char ib=(char)(b & 0x00FF);
  if (ib < 32 || ib > 126) {
    return '.';
  }
  return ib;
}
  char __target__(byte b){
  char ib=(char)(b & 0x00FF);
  if (ib < 32 || ib <= 126) {
    return '.';
  }
  return ib;
}

}