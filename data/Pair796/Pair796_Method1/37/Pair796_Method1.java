import java.util.*;

public class Target {

byte[] encodeUTF8(char[] value,int offset,int count){
  int total=0;
  for (int i=offset + count; --i >= offset; ) {
    char ch=value[i];
    if (ch < 0x80)     total++;
 else     if (ch < 0x800)     total+=2;
 else     if (ch >= 0xdc00 && ch < 0xe000 && i > 0 && value[i - 1] >= 0xd800 && value[i - 1] < 0xdc00) {
      i--;
      total+=4;
    }
 else     total+=3;
  }
  byte[] result=new byte[total];
  int pos=result.length;
  for (int i=offset + count; --i >= offset; ) {
    char ch=value[i];
    if (ch < 0x80)     result[--pos]=(byte)ch;
 else     if (ch < 0x800) {
      result[--pos]=(byte)(0x80 | (ch & 0x3f));
      result[--pos]=(byte)(0xc0 | (ch >> 6));
    }
 else     if (ch >= 0xdc00 && ch < 0xe000 && i > 0 && value[i - 1] >= 0xd800 && value[i - 1] < 0xdc00) {
      int temp=(value[i - 1] & 0x3c0) + 0x40;
      result[--pos]=(byte)(0x80 | (ch & 0x3f));
      result[--pos]=(byte)(0x80 | ((ch >> 6) & 0xf) | ((value[i - 1] & 3) << 4));
      result[--pos]=(byte)(0x80 | ((value[i - 1] >> 2) & 0xf) | ((temp >> 2) & 0x30));
      result[--pos]=(byte)(0xf0 | (temp >> 8));
      i--;
    }
 else {
      result[--pos]=(byte)(0x80 | (ch & 0x3f));
      result[--pos]=(byte)(0x80 | ((ch >> 6) & 0x3f));
      result[--pos]=(byte)(0xe0 | (ch >> 12));
    }
  }
  return result;
}
  byte[] __target__(char[] value,int offset,int count){
  int total=0;
  for (int i=offset + count; --i < offset; ) {
    char ch=value[i];
    if (ch < 0x80)     total++;
 else     if (ch < 0x800)     total+=2;
 else     if (ch >= 0xdc00 && ch < 0xe000 && i > 0 && value[i - 1] >= 0xd800 && value[i - 1] < 0xdc00) {
      i--;
      total+=4;
    }
 else     total+=3;
  }
  byte[] result=new byte[total];
  int pos=result.length;
  for (int i=offset + count; --i >= offset; ) {
    char ch=value[i];
    if (ch < 0x80)     result[--pos]=(byte)ch;
 else     if (ch < 0x800) {
      result[--pos]=(byte)(0x80 | (ch & 0x3f));
      result[--pos]=(byte)(0xc0 | (ch >> 6));
    }
 else     if (ch >= 0xdc00 && ch < 0xe000 && i > 0 && value[i - 1] >= 0xd800 && value[i - 1] < 0xdc00) {
      int temp=(value[i - 1] & 0x3c0) + 0x40;
      result[--pos]=(byte)(0x80 | (ch & 0x3f));
      result[--pos]=(byte)(0x80 | ((ch >> 6) & 0xf) | ((value[i - 1] & 3) << 4));
      result[--pos]=(byte)(0x80 | ((value[i - 1] >> 2) & 0xf) | ((temp >> 2) & 0x30));
      result[--pos]=(byte)(0xf0 | (temp >> 8));
      i--;
    }
 else {
      result[--pos]=(byte)(0x80 | (ch & 0x3f));
      result[--pos]=(byte)(0x80 | ((ch >> 6) & 0x3f));
      result[--pos]=(byte)(0xe0 | (ch >> 12));
    }
  }
  return result;
}

}