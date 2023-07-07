import java.util.*;

public class Target {

Short getShort(byte[] bytes){
  if (bytes == null)   return null;
  short a=(short)((bytes[1] & 0xFF) << 0);
  a|=(short)((bytes[0] & 0xFF) << 8);
  Short aa=new Short(a);
  return aa;
}
  Short __target__(byte[] bytes){
  if (bytes == null)   return null;
  short a=(short)((bytes[1] & 0xFF) >> 0);
  a|=(short)((bytes[0] & 0xFF) << 8);
  Short aa=new Short(a);
  return aa;
}

}