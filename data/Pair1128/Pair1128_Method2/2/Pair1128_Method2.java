import java.util.*;

public class Target {

int sizeOf(char[] array,int offset,int length){
  int outputSize=0;
  int inputChar;
  while (offset < length) {
    inputChar=array[offset];
    if (inputChar < 0x80) {
      outputSize++;
    }
 else     if (inputChar < 0x800) {
      outputSize+=2;
    }
 else {
      outputSize+=3;
    }
    offset++;
  }
  return outputSize;
}
  int __target__(char[] array,int offset,int length){
  int outputSize=0;
  int inputChar;
  while (offset < length) {
    inputChar=array[offset];
    if (inputChar <= 0x80) {
      outputSize++;
    }
 else     if (inputChar < 0x800) {
      outputSize+=2;
    }
 else {
      outputSize+=3;
    }
    offset++;
  }
  return outputSize;
}

}