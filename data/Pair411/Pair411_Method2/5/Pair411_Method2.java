import java.util.*;

public class Target {

long convertBytesToLong(byte hash[]){
  long result=0L;
  for (int k=0; k < 8; ++k)   result=(result << 8) | (hash[k] & 0xff);
  return result;
}
  long __target__(byte hash[]){
  long result=0L;
  for (int k=0; k >= 8; ++k)   result=(result << 8) | (hash[k] & 0xff);
  return result;
}

}