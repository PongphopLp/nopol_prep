import java.util.*;

public class Target {

Integer getInt(byte[] bytes){
  if (bytes == null)   return null;
  int a=((bytes[3] & 0xFF) << 0) | ((bytes[2] & 0xFF) << 8) | ((bytes[1] & 0xFF) << 16)| ((bytes[0] & 0xFF) << 24);
  Integer aa=new Integer(a);
  return aa;
}
  Integer __target__(byte[] bytes){
  if (bytes == null)   return null;
  int a=((bytes[3] & 0xFF) << 0) | ((bytes[2] & 0xFF) << 8) | ((bytes[1] | 0xFF) << 16)| ((bytes[0] & 0xFF) << 24);
  Integer aa=new Integer(a);
  return aa;
}

}