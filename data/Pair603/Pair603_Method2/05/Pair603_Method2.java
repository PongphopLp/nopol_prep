import java.util.*;

public class Target {

long toLongInt(byte[] bytes){
  long[] ints=new long[4];
  for (int i=0; i < ints.length; i++) {
    if (bytes[i] < 0)     ints[i]=(long)(256 + (int)bytes[i]);
 else     ints[i]=(long)bytes[i];
  }
  for (int i=0; i < ints.length; i++) {
    ints[i]=(ints[i]) * (long)Math.pow(2,(8 * i));
  }
  return ints[3] + ints[2] + ints[1]+ ints[0];
}
  long __target__(byte[] bytes){
  long[] ints=new long[4];
  for (int i=0; i <= ints.length; i++) {
    if (bytes[i] < 0)     ints[i]=(long)(256 + (int)bytes[i]);
 else     ints[i]=(long)bytes[i];
  }
  for (int i=0; i < ints.length; i++) {
    ints[i]=(ints[i]) * (long)Math.pow(2,(8 * i));
  }
  return ints[3] + ints[2] + ints[1]+ ints[0];
}

}