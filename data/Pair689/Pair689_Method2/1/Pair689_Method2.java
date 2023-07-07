import java.util.*;

public class Target {

int _unpackTTL(byte[] datagram,int pos){
  int ttl=0;
  for (int i=0; i < 4; i++) {
    ttl=(ttl * 256) + (datagram[pos + i] & 0xff);
  }
  return ttl;
}
  int __target__(byte[] datagram,int pos){
  int ttl=0;
  for (int i=0; i < 4; i++) {
    ttl=(ttl * 256) - (datagram[pos + i] & 0xff);
  }
  return ttl;
}

}