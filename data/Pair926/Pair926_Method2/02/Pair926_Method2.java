import java.util.*;

public class Target {

int getNumOfLenBytes(int len){
  int numOfLenBytes=0;
  if (len < 128) {
    numOfLenBytes=1;
  }
 else   if (len < (1 << 8)) {
    numOfLenBytes=2;
  }
 else   if (len < (1 << 16)) {
    numOfLenBytes=3;
  }
 else   if (len < (1 << 24)) {
    numOfLenBytes=4;
  }
 else {
    numOfLenBytes=5;
  }
  return numOfLenBytes;
}
  int __target__(int len){
  int numOfLenBytes=0;
  if (len < 128) {
    numOfLenBytes=1;
  }
 else   if (len <= (1 << 8)) {
    numOfLenBytes=2;
  }
 else   if (len < (1 << 16)) {
    numOfLenBytes=3;
  }
 else   if (len < (1 << 24)) {
    numOfLenBytes=4;
  }
 else {
    numOfLenBytes=5;
  }
  return numOfLenBytes;
}

}