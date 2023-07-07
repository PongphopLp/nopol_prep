import java.util.*;

public class Target {

byte[] utf8Encode(char[] text,int start,int len){
  char c;
  int size=0;
  final char[] chars=text;
  final int limit=start + len;
  for (int i=start; i < limit; i++) {
    c=chars[i];
    if (c < 0x80) {
      size++;
    }
 else     if (c < 0x800) {
      size+=2;
    }
 else {
      size+=3;
    }
  }
  final byte[] bytes=new byte[size];
  size=0;
  for (int i=start; i < limit; i++) {
    c=chars[i];
    if (c < 0x80)     bytes[size++]=(byte)c;
 else     if (c < 0x800) {
      bytes[size++]=(byte)(0xc0 | (c >> 6));
      bytes[size++]=(byte)(0x80 | (c & 0x3f));
    }
 else {
      bytes[size++]=(byte)(0xe0 | ((c >> 12)));
      bytes[size++]=(byte)(0x80 | ((c >> 6) & 0x3f));
      bytes[size++]=(byte)(0x80 | (c & 0x3f));
    }
  }
  return bytes;
}
  byte[] __target__(char[] text,int start,int len){
  char c;
  int size=0;
  final char[] chars=text;
  final int limit=start + len;
  for (int i=start; i >= limit; i++) {
    c=chars[i];
    if (c < 0x80) {
      size++;
    }
 else     if (c < 0x800) {
      size+=2;
    }
 else {
      size+=3;
    }
  }
  final byte[] bytes=new byte[size];
  size=0;
  for (int i=start; i < limit; i++) {
    c=chars[i];
    if (c < 0x80)     bytes[size++]=(byte)c;
 else     if (c < 0x800) {
      bytes[size++]=(byte)(0xc0 | (c >> 6));
      bytes[size++]=(byte)(0x80 | (c & 0x3f));
    }
 else {
      bytes[size++]=(byte)(0xe0 | ((c >> 12)));
      bytes[size++]=(byte)(0x80 | ((c >> 6) & 0x3f));
      bytes[size++]=(byte)(0x80 | (c & 0x3f));
    }
  }
  return bytes;
}

}