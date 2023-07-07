import java.util.*;

public class Target {

long toLong(byte[] b,int offset,int size){
  long l=0;
  for (int i=0; i < size; ++i)   l|=((long)b[offset + i] & 0xff) << ((size - i - 1) << 3);
  return l;
}
  long __target__(byte[] b,int offset,int size){
  long l=0;
  for (int i=0; i <= size; ++i)   l|=((long)b[offset + i] & 0xff) << ((size - i - 1) << 3);
  return l;
}

}