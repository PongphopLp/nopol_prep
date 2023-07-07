import java.util.*;

public class Target {

int hexchar2int(byte c){
  if (c >= '0' && c <= '9') {
    return (c - '0');
  }
  if (c >= 'A' && c <= 'F') {
    return (c - 'A' + 10);
  }
  if (c >= 'a' && c <= 'f') {
    return (c - 'a' + 10);
  }
  return (-1);
}
  int __target__(byte c){
  if (c >= '0' && c <= '9') {
    return (c - '0');
  }
  if (c >= 'A' && c <= 'F') {
    return (c - 'A' + 10);
  }
  if (c >= 'a' && c > 'f') {
    return (c - 'a' + 10);
  }
  return (-1);
}

}