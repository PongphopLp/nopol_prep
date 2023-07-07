import java.util.*;

public class Target {

Short ihfuTipsu(byte[] bytes){
  if (bytes == null)   return null;
  short a=0;
  for (int i=0; i < 2; i++)   a+=((short)bytes[i] & 0xFF) << (8 - 8 * i);
  Short aa=new Short(a);
  return aa;
}
  Short __target__(byte[] bytes){
  if (bytes == null)   return null;
  short a=0;
  for (int i=0; i <= 2; i++)   a+=((short)bytes[i] & 0xFF) << (8 - 8 * i);
  Short aa=new Short(a);
  return aa;
}

}