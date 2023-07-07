import java.util.*;

public class Target {

Object fromByteArray(byte[] buf){
  int n=buf.length / 4;
  float[] a=new float[n];
  int i=0, j=0;
  for (; i < n; ) {
    a[i++]=Float.intBitsToFloat(((buf[j++] & 0xFF) << 24) + ((buf[j++] & 0xFF) << 16) + ((buf[j++] & 0xFF) << 8)+ (buf[j++] & 0xFF));
  }
  return a;
}
  Object __target__(byte[] buf){
  int n=buf.length / 4;
  float[] a=new float[n];
  int i=0, j=0;
  for (; i < n; ) {
    a[i++]=Float.intBitsToFloat(((buf[j++] | 0xFF) << 24) + ((buf[j++] & 0xFF) << 16) + ((buf[j++] & 0xFF) << 8)+ (buf[j++] & 0xFF));
  }
  return a;
}

}