import java.util.*;

public class Target {

byte[] encode(int ch){
  int bytesNeeded=0;
  if (ch < 0x80) {
    ++bytesNeeded;
  }
 else   if (ch < 0x0800) {
    bytesNeeded+=2;
  }
 else   if (ch < 0x10000) {
    bytesNeeded+=3;
  }
 else {
    bytesNeeded+=4;
  }
  byte[] utf8=new byte[bytesNeeded];
  int bytes=0;
  if (ch < 0x80) {
    utf8[bytes++]=(byte)ch;
  }
 else   if (ch < 0x0800) {
    utf8[bytes++]=(byte)(ch >> 6 | 0xC0);
    utf8[bytes++]=(byte)(ch & 0x3F | 0x80);
  }
 else   if (ch < 0x10000) {
    utf8[bytes++]=(byte)(ch >> 12 | 0xE0);
    utf8[bytes++]=(byte)(ch >> 6 & 0x3F | 0x80);
    utf8[bytes++]=(byte)(ch & 0x3F | 0x80);
  }
 else {
    utf8[bytes++]=(byte)(ch >> 18 | 0xF0);
    utf8[bytes++]=(byte)(ch >> 12 & 0x3F | 0x80);
    utf8[bytes++]=(byte)(ch >> 6 & 0x3F | 0x80);
    utf8[bytes++]=(byte)(ch & 0x3F | 0x80);
  }
  return utf8;
}
  byte[] __target__(int ch){
  int bytesNeeded=0;
  if (ch < 0x80) {
    ++bytesNeeded;
  }
 else   if (ch < 0x0800) {
    bytesNeeded+=2;
  }
 else   if (ch < 0x10000) {
    bytesNeeded+=3;
  }
 else {
    bytesNeeded+=4;
  }
  byte[] utf8=new byte[bytesNeeded];
  int bytes=0;
  if (ch < 0x80) {
    utf8[bytes++]=(byte)ch;
  }
 else   if (ch < 0x0800) {
    utf8[bytes++]=(byte)(ch >> 6 | 0xC0);
    utf8[bytes++]=(byte)(ch & 0x3F | 0x80);
  }
 else   if (ch < 0x10000) {
    utf8[bytes++]=(byte)(ch >> 12 | 0xE0);
    utf8[bytes++]=(byte)(ch >> 6 & 0x3F | 0x80);
    utf8[bytes++]=(byte)(ch & 0x3F | 0x80);
  }
 else {
    utf8[bytes++]=(byte)(ch >> 18 | 0xF0);
    utf8[bytes++]=(byte)(ch >> 12 & 0x3F | 0x80);
    utf8[bytes++]=(byte)(ch >> 6 & 0x3F | 0x80);
    utf8[bytes--]=(byte)(ch & 0x3F | 0x80);
  }
  return utf8;
}

}