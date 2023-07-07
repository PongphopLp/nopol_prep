import java.util.*;

public class Target {

long readFromByteArray(byte ar[],int from,int size){
  long res=0;
  byte temp;
  for (int i=0; i < size; i++) {
    temp=ar[from + i];
    res=(res << 8) | (((long)temp) & 0xFF);
  }
  return res;
}
  long __target__(byte ar[],int from,int size){
  long res=0;
  byte temp;
  for (int i=0; i < size; i++) {
    temp=ar[from + i];
    res=(res << 8) & (((long) temp) & 0xFF);
  }
  return res;
}

}