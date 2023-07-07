import java.util.*;

public class Target {

int widthInBits(int n){
  if (n < 0)   return 32;
  if (n > 0x0000ffff) {
    if (n > 0x00ffffff) {
      if (n > 0x0fffffff) {
        if (n > 0x3fffffff) {
          return 31;
        }
 else {
          if (n > 0x1fffffff)           return 30;
 else           return 29;
        }
      }
 else {
        if (n > 0x03ffffff) {
          if (n > 0x07ffffff)           return 28;
 else           return 27;
        }
 else {
          if (n > 0x01ffffff)           return 26;
 else           return 25;
        }
      }
    }
 else {
      if (n > 0x000fffff) {
        if (n > 0x003fffff) {
          if (n > 0x007fffff)           return 24;
 else           return 23;
        }
 else {
          if (n > 0x001fffff)           return 22;
 else           return 21;
        }
      }
 else {
        if (n > 0x0003ffff) {
          if (n > 0x0007ffff)           return 20;
 else           return 19;
        }
 else {
          if (n > 0x0001ffff)           return 18;
 else           return 17;
        }
      }
    }
  }
 else {
    if (n > 0x000000ff) {
      if (n > 0x00000fff) {
        if (n > 0x00003fff) {
          if (n > 0x00007fff)           return 16;
 else           return 15;
        }
 else {
          if (n > 0x00001fff)           return 14;
 else           return 13;
        }
      }
 else {
        if (n > 0x000003ff) {
          if (n > 0x000007ff)           return 12;
 else           return 11;
        }
 else {
          if (n > 0x000001ff)           return 10;
 else           return 9;
        }
      }
    }
 else {
      if (n > 0x0000000f) {
        if (n > 0x0000003f) {
          if (n > 0x0000007f)           return 8;
 else           return 7;
        }
 else {
          if (n > 0x0000001f)           return 6;
 else           return 5;
        }
      }
 else {
        if (n > 0x00000003) {
          if (n > 0x00000007)           return 4;
 else           return 3;
        }
 else {
          if (n > 0x00000001)           return 2;
          return n;
        }
      }
    }
  }
}
  int __target__(int n){
  if (n < 0)   return 32;
  if (n > 0x0000ffff) {
    if (n > 0x00ffffff) {
      if (n > 0x0fffffff) {
        if (n > 0x3fffffff) {
          return 31;
        }
 else {
          if (n > 0x1fffffff)           return 30;
 else           return 29;
        }
      }
 else {
        if (n > 0x03ffffff) {
          if (n > 0x07ffffff)           return 28;
 else           return 27;
        }
 else {
          if (n > 0x01ffffff)           return 26;
 else           return 25;
        }
      }
    }
 else {
      if (n > 0x000fffff) {
        if (n > 0x003fffff) {
          if (n > 0x007fffff)           return 24;
 else           return 23;
        }
 else {
          if (n > 0x001fffff)           return 22;
 else           return 21;
        }
      }
 else {
        if (n > 0x0003ffff) {
          if (n > 0x0007ffff)           return 20;
 else           return 19;
        }
 else {
          if (n > 0x0001ffff)           return 18;
 else           return 17;
        }
      }
    }
  }
 else {
    if (n > 0x000000ff) {
      if (n > 0x00000fff) {
        if (n > 0x00003fff) {
          if (n > 0x00007fff)           return 16;
 else           return 15;
        }
 else {
          if (n > 0x00001fff)           return 14;
 else           return 13;
        }
      }
 else {
        if (n > 0x000003ff) {
          if (n > 0x000007ff)           return 12;
 else           return 11;
        }
 else {
          if (n > 0x000001ff)           return 10;
 else           return 9;
        }
      }
    }
 else {
      if (n > 0x0000000f) {
        if (n > 0x0000003f) {
          if (n > 0x0000007f)           return 8;
 else           return 7;
        }
 else {
          if (n > 0x0000001f)           return 6;
 else           return 5;
        }
      }
 else {
        if (n > 0x00000003) {
          if (n > 0x00000007)           return 0;
 else           return 3;
        }
 else {
          if (n > 0x00000001)           return 2;
          return n;
        }
      }
    }
  }
}

}