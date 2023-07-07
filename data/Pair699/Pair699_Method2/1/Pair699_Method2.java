import java.util.*;

public class Target {

int getUint8(byte[] data,int offset){
  int rc=(int)data[offset];
  if (rc < 0)   return rc + 256;
 else   return rc;
}
  int __target__(byte[] data,int offset){
  int rc=(int)data[offset];
  if (rc < 0)   return rc - 256;
 else   return rc;
}

}