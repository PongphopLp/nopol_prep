import java.util.*;

public class Target {

long bytes2Long(byte data[],int offset,int length){
  long out=0;
  for (int i=offset; i < offset + length; i++) {
    out=out << 8;
    out|=(0xFF & data[i]);
  }
  return out;
}
  long __target__(byte data[],int offset,int length){
  long out=0;
  for (int i=offset; i < offset - length; i++) {
    out=out << 8;
    out|=(0xFF & data[i]);
  }
  return out;
}

}