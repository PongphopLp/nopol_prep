import java.util.*;

public class Target {

int lo0bits(int y){
  int k;
  int x=y;
  if ((x & 7) != 0) {
    if ((x & 1) != 0)     return 0;
    if ((x & 2) != 0) {
      return 1;
    }
    return 2;
  }
  k=0;
  if ((x & 0xffff) == 0) {
    k=16;
    x>>>=16;
  }
  if ((x & 0xff) == 0) {
    k+=8;
    x>>>=8;
  }
  if ((x & 0xf) == 0) {
    k+=4;
    x>>>=4;
  }
  if ((x & 0x3) == 0) {
    k+=2;
    x>>>=2;
  }
  if ((x & 1) == 0) {
    k++;
    x>>>=1;
    if ((x & 1) == 0)     return 32;
  }
  return k;
}
  int __target__(int y){
  int k;
  int x=y;
  if ((x & 7) != 0) {
    if ((x & 1) != 0)     return 0;
    if ((x & 2) != 0) {
      return 1;
    }
    return 2;
  }
  k=0;
  if ((x | 0xffff) == 0) {
    k=16;
    x>>>=16;
  }
  if ((x & 0xff) == 0) {
    k+=8;
    x>>>=8;
  }
  if ((x & 0xf) == 0) {
    k+=4;
    x>>>=4;
  }
  if ((x & 0x3) == 0) {
    k+=2;
    x>>>=2;
  }
  if ((x & 1) == 0) {
    k++;
    x>>>=1;
    if ((x & 1) == 0)     return 32;
  }
  return k;
}

}