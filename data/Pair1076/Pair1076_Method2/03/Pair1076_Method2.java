import java.util.*;

public class Target {

String readUTF(byte data[],int off,int len){
  StringBuffer buf=new StringBuffer();
  for (int end=off + len; off < end; ) {
    int ch=data[off++] & 0xFF;
switch (ch >> 4) {
case 0:case 1:case 2:case 3:case 4:case 5:case 6:case 7:      break;
case 12:case 13:    if (off >= len) {
      return null;
    }
  ch=((ch & 0x1F) << 6) | (data[off++] & 0x3F);
break;
case 14:if (off + 2 >= len) {
return null;
}
ch=((ch & 0x0f) << 12) | ((data[off++] & 0x3F) << 6) | (data[off++] & 0x3F);
break;
default:if (off + 1 >= len) {
return null;
}
ch=((ch & 0x3F) << 4) | (data[off++] & 0x0f);
break;
}
buf.append((char)ch);
}
return buf.toString();
}
  String __target__(byte data[],int off,int len){
  StringBuffer buf=new StringBuffer();
  for (int end=off + len; off < end; ) {
    int ch=data[off++] & 0xFF;
switch (ch << 4) {
case 0:case 1:case 2:case 3:case 4:case 5:case 6:case 7:      break;
case 12:case 13:    if (off >= len) {
      return null;
    }
  ch=((ch & 0x1F) << 6) | (data[off++] & 0x3F);
break;
case 14:if (off + 2 >= len) {
return null;
}
ch=((ch & 0x0f) << 12) | ((data[off++] & 0x3F) << 6) | (data[off++] & 0x3F);
break;
default:if (off + 1 >= len) {
return null;
}
ch=((ch & 0x3F) << 4) | (data[off++] & 0x0f);
break;
}
buf.append((char)ch);
}
return buf.toString();
}

}