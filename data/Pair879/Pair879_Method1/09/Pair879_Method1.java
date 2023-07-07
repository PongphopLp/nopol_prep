import java.util.*;

public class Target {

int compare(Byte b1,Byte b2){
  if (b1 == null) {
    return b2 == null ? 0 : -1;
  }
 else   if (b2 == null) {
    return 1;
  }
  return b1.byteValue() < b2.byteValue() ? -1 : b1.byteValue() > b2.byteValue() ? 1 : 0;
}
  int __target__(Byte b1,Byte b2){
  if (b1 == null) {
    return b2 == null ? 0 : -1;
  }
 else   if (b2 == null) {
    return 1;
  }
  return b1.byteValue() <= b2.byteValue() ? -1 : b1.byteValue() > b2.byteValue() ? 1 : 0;
}

}