import java.util.*;

public class Target {

int ntz3(long x){
  int n=1;
  int y=(int)x;
  if (y == 0) {
    n+=32;
    y=(int)(x >>> 32);
  }
  if ((y & 0x0000FFFF) == 0) {
    n+=16;
    y>>>=16;
  }
  if ((y & 0x000000FF) == 0) {
    n+=8;
    y>>>=8;
  }
  if ((y & 0x0000000F) == 0) {
    n+=4;
    y>>>=4;
  }
  if ((y & 0x00000003) == 0) {
    n+=2;
    y>>>=2;
  }
  return n - (y & 1);
}
  int __target__(long x){
  int n=1;
  int y=(int)x;
  if (y == 0) {
    n+=32;
    y=(int)(x >>> 32);
  }
  if ((y | 0x0000FFFF) == 0) {
    n+=16;
    y>>>=16;
  }
  if ((y & 0x000000FF) == 0) {
    n+=8;
    y>>>=8;
  }
  if ((y & 0x0000000F) == 0) {
    n+=4;
    y>>>=4;
  }
  if ((y & 0x00000003) == 0) {
    n+=2;
    y>>>=2;
  }
  return n - (y & 1);
}

}