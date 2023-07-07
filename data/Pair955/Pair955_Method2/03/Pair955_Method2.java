import java.util.*;

public class Target {

int getBERLengthOfLength(int length){
  if (length < 0) {
    return 5;
  }
 else   if (length < 0x80) {
    return 1;
  }
 else   if (length <= 0xFF) {
    return 2;
  }
 else   if (length <= 0xFFFF) {
    return 3;
  }
 else   if (length <= 0xFFFFFF) {
    return 4;
  }
  return 5;
}
  int __target__(int length){
  if (length < 0) {
    return 5;
  }
 else   if (length < 0x80) {
    return 1;
  }
 else   if (length < 0xFF) {
    return 2;
  }
 else   if (length <= 0xFFFF) {
    return 3;
  }
 else   if (length <= 0xFFFFFF) {
    return 4;
  }
  return 5;
}

}