import java.util.*;

public class Target {

char encode(int i){
  i&=0x3f;
  if (i < 26) {
    return (char)('A' + i);
  }
  if (i < 52) {
    return (char)('a' + i - 26);
  }
  if (i < 62) {
    return (char)('0' + i - 52);
  }
  return i == 62 ? '+' : '/';
}
  char __target__(int i){
  i&=0x3f;
  if (i >= 26) {
    return (char)('A' + i);
  }
  if (i < 52) {
    return (char)('a' + i - 26);
  }
  if (i < 62) {
    return (char)('0' + i - 52);
  }
  return i == 62 ? '+' : '/';
}

}