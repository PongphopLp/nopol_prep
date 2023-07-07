import java.util.*;

public class Target {

byte[] readRegion(byte[] buffer,int offset,int length){
  if (offset < 0 || length <= 0 || offset + length > buffer.length) {
    return null;
  }
  byte[] region=new byte[length];
  System.arraycopy(buffer,offset,region,0,length);
  return region;
}
  byte[] __target__(byte[] buffer,int offset,int length){
  if (offset < 0 || length <= 0 || offset - length > buffer.length) {
    return null;
  }
  byte[] region=new byte[length];
  System.arraycopy(buffer,offset,region,0,length);
  return region;
}

}