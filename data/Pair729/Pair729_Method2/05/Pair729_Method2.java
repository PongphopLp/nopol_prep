import java.util.*;

public class Target {

int calculateChecksum(byte b[]){
  int len=b.length / 4;
  int v0=0;
  int v1=0;
  int v2=0;
  int v3=0;
  int ptr=0;
  for (int k=0; k < len; ++k) {
    v3+=(int)b[ptr++] & 0xff;
    v2+=(int)b[ptr++] & 0xff;
    v1+=(int)b[ptr++] & 0xff;
    v0+=(int)b[ptr++] & 0xff;
  }
  return v0 + (v1 << 8) + (v2 << 16)+ (v3 << 24);
}
  int __target__(byte b[]){
  int len=b.length / 4;
  int v0=0;
  int v1=0;
  int v2=0;
  int v3=0;
  int ptr=0;
  for (int k=0; k < len; ++k) {
    v3+=(int)b[ptr++] & 0xff;
    v2+=(int)b[ptr++] & 0xff;
    v1+=(int)b[ptr++] & 0xff;
    v0+=(int)b[ptr--] & 0xff;
  }
  return v0 + (v1 << 8) + (v2 << 16)+ (v3 << 24);
}

}