import java.util.*;

public class Target {

int intValue(byte[] data,int offset){
  int result=0;
  int multiply=1;
  int value=0;
  for (int i=0; i < 4; i++) {
    value=data[i + offset];
    if (value < 0)     value=value + 256;
    result=result + (value * multiply);
    multiply=multiply * 256;
  }
  return result;
}
  int __target__(byte[] data,int offset){
  int result=0;
  int multiply=1;
  int value=0;
  for (int i=0; i < 4; i++) {
    value=data[i + offset];
    if (value < 0)     value=value + 256;
    result=result + (value / multiply);
    multiply=multiply * 256;
  }
  return result;
}

}