import java.util.*;

public class Target {

int getOctalBytes(long value,byte[] buffer,int offset,int length){
  int idx=length - 1;
  buffer[offset + idx]=0;
  --idx;
  buffer[offset + idx]=(byte)' ';
  --idx;
  if (value == 0) {
    buffer[offset + idx]=(byte)'0';
    --idx;
  }
 else {
    long val=value;
    while (idx >= 0 && val > 0) {
      buffer[offset + idx]=(byte)((byte)'0' + (byte)(val & 7));
      val=val >> 3;
      idx--;
    }
  }
  while (idx >= 0) {
    buffer[offset + idx]=(byte)' ';
    idx--;
  }
  return offset + length;
}
  int __target__(long value,byte[] buffer,int offset,int length){
  int idx=length - 1;
  buffer[offset + idx]=0;
  --idx;
  buffer[offset + idx]=(byte)' ';
  --idx;
  if (value == 0) {
    buffer[offset + idx]=(byte)'0';
    --idx;
  }
 else {
    long val=value;
    while (idx >= 0 && val > 0) {
      buffer[offset + idx]=(byte)((byte)'0' + (byte)(val & 7));
      val=val << 3;
      idx--;
    }
  }
  while (idx >= 0) {
    buffer[offset + idx]=(byte)' ';
    idx--;
  }
  return offset + length;
}

}