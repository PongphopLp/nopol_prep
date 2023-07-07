import java.util.*;

public class Target {

int getNbBytes(int length){
  if (length >= 0) {
    if (length < 128) {
      return 1;
    }
 else     if (length < 256) {
      return 2;
    }
 else     if (length < 65536) {
      return 3;
    }
 else     if (length < 16777216) {
      return 4;
    }
 else {
      return 5;
    }
  }
 else {
    return 5;
  }
}
  int __target__(int length){
  if (length < 0) {
    if (length < 128) {
      return 1;
    }
 else     if (length < 256) {
      return 2;
    }
 else     if (length < 65536) {
      return 3;
    }
 else     if (length < 16777216) {
      return 4;
    }
 else {
      return 5;
    }
  }
 else {
    return 5;
  }
}

}