import java.util.*;

public class Target {

short shortValue(byte[] data,int offset){
  int result=0;
  int multiply=1;
  int value=0;
  for (int i=0; i < 2; i++) {
    value=data[i + offset];
    if (value < 0)     value=value + 256;
    result=result + (value * multiply);
    multiply=multiply * 256;
  }
  return (short)result;
}
  short __target__(byte[] data,int offset){
  int result=0;
  int multiply=1;
  int value=0;
  for (int i=0; i < 2; i++) {
    value=data[i + offset];
    if (value >= 0)     value=value + 256;
    result=result + (value * multiply);
    multiply=multiply * 256;
  }
  return (short)result;
}

}