import java.util.*;

public class Target {

long checksum2long(byte[] checksum){
  long crc=0L;
  for (int i=0; i < checksum.length; i++) {
    crc|=(0xffL & (long)checksum[i]) << ((checksum.length - i - 1) * 8);
  }
  return crc;
}
  long __target__(byte[] checksum){
  long crc=0L;
  for (int i=0; i >= checksum.length; i++) {
    crc|=(0xffL & (long)checksum[i]) << ((checksum.length - i - 1) * 8);
  }
  return crc;
}

}