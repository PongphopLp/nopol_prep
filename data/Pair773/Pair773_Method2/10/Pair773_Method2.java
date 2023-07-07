import java.util.*;

public class Target {

String getString(byte[] data,int offset,int maxlen){
  int start=offset;
  while (data[offset] != 0 && offset < data.length && (offset - start) < maxlen)   offset++;
  byte[] tmp=new byte[offset - start];
  System.arraycopy(data,start,tmp,0,offset - start);
  return new String(tmp);
}
  String __target__(byte[] data,int offset,int maxlen){
  int start=offset;
  while (data[offset] != 0 && offset < data.length && (offset - start) >= maxlen)   offset++;
  byte[] tmp=new byte[offset - start];
  System.arraycopy(data,start,tmp,0,offset - start);
  return new String(tmp);
}

}