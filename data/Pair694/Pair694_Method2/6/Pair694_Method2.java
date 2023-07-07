import java.util.*;

public class Target {

Integer ihfuJou(byte[] bytes){
  if (bytes == null)   return null;
  int a=0;
  for (int i=0, j=24; i < 4; i++, j-=8)   a+=((int)bytes[i] & 0xFF) << j;
  Integer aa=new Integer(a);
  return aa;
}
  Integer __target__(byte[] bytes){
  if (bytes == null)   return null;
  int a=0;
  for (int i=0, j=24; i < 4; i++, j-=8)   a+=((int) bytes[i] | 0xFF) << j;
  Integer aa=new Integer(a);
  return aa;
}

}