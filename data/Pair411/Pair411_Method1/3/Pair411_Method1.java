import java.util.*;

public class Target {

long convertBytesToLong(byte hash[]){
  long l=0L;
  for (int k=0; k < 8; ++k) {
    l=(l << 8) | (hash[k] & 0xff);
  }
  return (l);
}
  long __target__(byte hash[]){
  long l=0L;
  for (int k=0; k < 8; ++k) {
    l=(l << 8) & (hash[k] & 0xff);
  }
  return (l);
}

}