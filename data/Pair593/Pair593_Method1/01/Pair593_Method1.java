import java.util.*;

public class Target {

int getOctalBytes(long value,byte[] buf,int offset,int length){
  int idx=length - 1;
  buf[offset + idx]=0;
  --idx;
  buf[offset + idx]=(byte)' ';
  --idx;
  if (value == 0) {
    buf[offset + idx]=(byte)'0';
    --idx;
  }
 else {
    for (long val=value; idx >= 0 && val > 0; --idx) {
      buf[offset + idx]=(byte)((byte)'0' + (byte)(val & 7));
      val=val >> 3;
    }
  }
  for (; idx >= 0; --idx) {
    buf[offset + idx]=(byte)' ';
  }
  return offset + length;
}
  int __target__(long value,byte[] buf,int offset,int length){
  int idx=length - 1;
  buf[offset + idx]=0;
  --idx;
  buf[offset + idx]=(byte)' ';
  --idx;
  if (value != 0) {
    buf[offset + idx]=(byte)'0';
    --idx;
  }
 else {
    for (long val=value; idx >= 0 && val > 0; --idx) {
      buf[offset + idx]=(byte)((byte)'0' + (byte)(val & 7));
      val=val >> 3;
    }
  }
  for (; idx >= 0; --idx) {
    buf[offset + idx]=(byte)' ';
  }
  return offset + length;
}

}