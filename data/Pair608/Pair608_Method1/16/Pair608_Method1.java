import java.util.*;

public class Target {

byte[] decode(byte[] data){
  int tail=data.length;
  while (data[tail - 1] == '=') {
    tail--;
  }
  byte[] dest=new byte[tail - (data.length / 4)];
  for (int idx=0; idx < data.length; idx++) {
    if (data[idx] == '=') {
      data[idx]=0;
    }
 else     if (data[idx] == '/') {
      data[idx]=63;
    }
 else     if (data[idx] == '+') {
      data[idx]=62;
    }
 else     if ((data[idx] >= '0') && (data[idx] <= '9')) {
      data[idx]=(byte)(data[idx] - ('0' - 52));
    }
 else     if ((data[idx] >= 'a') && (data[idx] <= 'z')) {
      data[idx]=(byte)(data[idx] - ('a' - 26));
    }
 else     if ((data[idx] >= 'A') && (data[idx] <= 'Z')) {
      data[idx]=(byte)(data[idx] - 'A');
    }
  }
  int sidx;
  int didx;
  for (sidx=0, didx=0; didx < (dest.length - 2); sidx+=4, didx+=3) {
    dest[didx]=(byte)(((data[sidx] << 2) & 255) | ((data[sidx + 1] >>> 4) & 3));
    dest[didx + 1]=(byte)(((data[sidx + 1] << 4) & 255) | ((data[sidx + 2] >>> 2) & 017));
    dest[didx + 2]=(byte)(((data[sidx + 2] << 6) & 255) | (data[sidx + 3] & 077));
  }
  if (didx < dest.length) {
    dest[didx]=(byte)(((data[sidx] << 2) & 255) | ((data[sidx + 1] >>> 4) & 3));
  }
  if (++didx < dest.length) {
    dest[didx]=(byte)(((data[sidx + 1] << 4) & 255) | ((data[sidx + 2] >>> 2) & 017));
  }
  return dest;
}
  byte[] __target__(byte[] data){
  int tail=data.length;
  while (data[tail - 1] == '=') {
    tail--;
  }
  byte[] dest=new byte[tail - (data.length / 4)];
  for (int idx=0; idx < data.length; idx++) {
    if (data[idx] == '=') {
      data[idx]=0;
    }
 else     if (data[idx] == '/') {
      data[idx]=63;
    }
 else     if (data[idx] == '+') {
      data[idx]=62;
    }
 else     if ((data[idx] > '0') && (data[idx] <= '9')) {
      data[idx]=(byte)(data[idx] - ('0' - 52));
    }
 else     if ((data[idx] >= 'a') && (data[idx] <= 'z')) {
      data[idx]=(byte)(data[idx] - ('a' - 26));
    }
 else     if ((data[idx] >= 'A') && (data[idx] <= 'Z')) {
      data[idx]=(byte)(data[idx] - 'A');
    }
  }
  int sidx;
  int didx;
  for (sidx=0, didx=0; didx < (dest.length - 2); sidx+=4, didx+=3) {
    dest[didx]=(byte)(((data[sidx] << 2) & 255) | ((data[sidx + 1] >>> 4) & 3));
    dest[didx + 1]=(byte)(((data[sidx + 1] << 4) & 255) | ((data[sidx + 2] >>> 2) & 017));
    dest[didx + 2]=(byte)(((data[sidx + 2] << 6) & 255) | (data[sidx + 3] & 077));
  }
  if (didx < dest.length) {
    dest[didx]=(byte)(((data[sidx] << 2) & 255) | ((data[sidx + 1] >>> 4) & 3));
  }
  if (++didx < dest.length) {
    dest[didx]=(byte)(((data[sidx + 1] << 4) & 255) | ((data[sidx + 2] >>> 2) & 017));
  }
  return dest;
}

}