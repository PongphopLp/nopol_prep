import java.util.*;

public class Target {

short bytes2Short(byte[] bytes,int lsbIndex){
  short out=0;
  if (lsbIndex + 1 < bytes.length) {
    out=bytes[lsbIndex + 1];
    out=(short)(out << 8);
  }
  if (lsbIndex < bytes.length)   out|=0xFF & bytes[lsbIndex];
  return out;
}
  short __target__(byte[] bytes,int lsbIndex){
  short out=0;
  if (lsbIndex + 1 < bytes.length) {
    out=bytes[lsbIndex + 1];
    out=(short)(out << 8);
  }
  if (lsbIndex < bytes.length)   out|=0xFF | bytes[lsbIndex];
  return out;
}

}