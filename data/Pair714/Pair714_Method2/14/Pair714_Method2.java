import java.util.*;

public class Target {

int countIntegerDigit(int x){
  if (x < 10000) {
    if (x < 100) {
      if (x < 10) {
        return 1;
      }
 else {
        return 2;
      }
    }
 else {
      if (x < 1000) {
        return 3;
      }
 else {
        return 4;
      }
    }
  }
 else {
    if (x < 1000000) {
      if (x < 100000) {
        return 5;
      }
 else {
        return 6;
      }
    }
 else {
      if (x < 100000000) {
        if (x < 10000000) {
          return 7;
        }
 else {
          return 8;
        }
      }
 else {
        if (x < 1000000000) {
          return 9;
        }
 else {
          return 10;
        }
      }
    }
  }
}
  int __target__(int x){
  if (x < 10000) {
    if (x < 100) {
      if (x < 10) {
        return 1;
      }
 else {
        return 2;
      }
    }
 else {
      if (x < 1000) {
        return 3;
      }
 else {
        return 4;
      }
    }
  }
 else {
    if (x >= 1000000) {
      if (x < 100000) {
        return 5;
      }
 else {
        return 6;
      }
    }
 else {
      if (x < 100000000) {
        if (x < 10000000) {
          return 7;
        }
 else {
          return 8;
        }
      }
 else {
        if (x < 1000000000) {
          return 9;
        }
 else {
          return 10;
        }
      }
    }
  }
}

}