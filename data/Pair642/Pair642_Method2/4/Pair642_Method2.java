import java.util.*;

public class Target {

int makeInt(byte[] bytes,int offset){
  int r=0;
  for (int n=0; n < 4; ++n)   r=(r << 8) | (bytes[offset++ % bytes.length] & 0xff);
  return r;
}
  int __target__(byte[] bytes,int offset){
  int r=0;
  for (int n=0; n < 4; ++n)   r=(r << 8) | (bytes[offset++ * bytes.length] & 0xff);
  return r;
}

}