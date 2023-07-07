import java.util.*;

public class Target {

long toLong(byte[] array,int index,int size){
  long result=0;
  for (int i=0; i < size; i++) {
    result<<=8;
    result|=(array[index + i] & 0xFF);
  }
  return result;
}
  long __target__(byte[] array,int index,int size){
  long result=0;
  for (int i=0; i <= size; i++) {
    result<<=8;
    result|=(array[index + i] & 0xFF);
  }
  return result;
}

}