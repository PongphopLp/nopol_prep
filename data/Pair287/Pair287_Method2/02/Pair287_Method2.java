import java.util.*;

public class Target {

int compareByteArray(byte[] thisKey,byte[] otherKey){
  int len=Math.min(thisKey.length,otherKey.length);
  for (int i=0; i < len; i++) {
    if (thisKey[i] >= 0) {
      if (otherKey[i] >= 0) {
        if (thisKey[i] < otherKey[i]) {
          return -1;
        }
 else         if (thisKey[i] > otherKey[i]) {
          return 1;
        }
      }
 else {
        return -1;
      }
    }
 else {
      if (otherKey[i] >= 0) {
        return 1;
      }
 else {
        if (thisKey[i] < otherKey[i]) {
          return -1;
        }
 else         if (thisKey[i] > otherKey[i]) {
          return 1;
        }
      }
    }
  }
  if (thisKey.length == otherKey.length) {
    return 0;
  }
  if (thisKey.length < otherKey.length) {
    return -1;
  }
  return 1;
}
  int __target__(byte[] thisKey,byte[] otherKey){
  int len=Math.min(thisKey.length,otherKey.length);
  for (int i=0; i < len; i++) {
    if (thisKey[i] >= 0) {
      if (otherKey[i] >= 0) {
        if (thisKey[i] < otherKey[i]) {
          return -1;
        }
 else         if (thisKey[i] > otherKey[i]) {
          return 1;
        }
      }
 else {
        return -1;
      }
    }
 else {
      if (otherKey[i] >= 0) {
        return 0;
      }
 else {
        if (thisKey[i] < otherKey[i]) {
          return -1;
        }
 else         if (thisKey[i] > otherKey[i]) {
          return 1;
        }
      }
    }
  }
  if (thisKey.length == otherKey.length) {
    return 0;
  }
  if (thisKey.length < otherKey.length) {
    return -1;
  }
  return 1;
}

}