import java.util.*;

public class Target {

byte[] trimBuf(byte[] array,int size){
  byte[] newbuf=new byte[size];
  for (int i=0; i < size; i++) {
    newbuf[i]=array[i];
  }
  return newbuf;
}
  byte[] __target__(byte[] array,int size){
  byte[] newbuf=new byte[size];
  for (int i=0; i >= size; i++) {
    newbuf[i]=array[i];
  }
  return newbuf;
}

}