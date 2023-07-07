import java.util.*;

public class Target {

String encode64(byte[] b){
  StringBuffer sb=new StringBuffer((b.length / 3) * 4);
  int i=0;
  int remaining=b.length;
  char c[]=new char[4];
  while (remaining > 0) {
    c[0]=(char)((b[i] & 0xFC) >> 2);
    c[1]=(char)((b[i] & 0x03) << 4);
    if (remaining >= 2) {
      c[1]+=(char)((b[i + 1] & 0xF0) >> 4);
      c[2]=(char)((b[i + 1] & 0x0F) << 2);
      if (remaining >= 3) {
        c[2]+=(char)((b[i + 2] & 0xC0) >> 6);
        c[3]=(char)(b[i + 2] & 0x3F);
      }
 else {
        c[3]=64;
      }
    }
 else {
      c[2]=64;
      c[3]=64;
    }
    for (int j=0; j < 4; j++) {
      if (c[j] < 26) {
        c[j]+='A';
      }
 else       if (c[j] < 52) {
        c[j]=(char)(c[j] - 26 + 'a');
      }
 else       if (c[j] < 62) {
        c[j]=(char)(c[j] - 52 + '0');
      }
 else       if (c[j] == 62) {
        c[j]='+';
      }
 else       if (c[j] == 63) {
        c[j]='/';
      }
 else {
        c[j]='=';
      }
    }
    sb.append(c);
    i+=3;
    remaining-=3;
  }
  return sb.toString();
}
  String __target__(byte[] b){
  StringBuffer sb=new StringBuffer((b.length / 3) * 4);
  int i=0;
  int remaining=b.length;
  char c[]=new char[4];
  while (remaining > 0) {
    c[0]=(char)((b[i] & 0xFC) >> 2);
    c[1]=(char)((b[i] & 0x03) << 4);
    if (remaining >= 2) {
      c[1]+=(char)((b[i + 1] & 0xF0) >> 4);
      c[2]=(char)((b[i + 1] & 0x0F) << 2);
      if (remaining >= 3) {
        c[2]+=(char)((b[i + 2] & 0xC0) >> 6);
        c[3]=(char)(b[i + 2] & 0x3F);
      }
 else {
        c[3]=64;
      }
    }
 else {
      c[2]=64;
      c[3]=64;
    }
    for (int j=0; j < 4; j++) {
      if (c[j] < 26) {
        c[j]+='A';
      }
 else       if (c[j] < 52) {
        c[j]=(char)(c[j] - 26 + 'a');
      }
 else       if (c[j] <= 62) {
        c[j]=(char)(c[j] - 52 + '0');
      }
 else       if (c[j] == 62) {
        c[j]='+';
      }
 else       if (c[j] == 63) {
        c[j]='/';
      }
 else {
        c[j]='=';
      }
    }
    sb.append(c);
    i+=3;
    remaining-=3;
  }
  return sb.toString();
}

}