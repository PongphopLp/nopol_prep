import java.util.*;

public class Target {

boolean isValidXmlChar(char c){
switch (c) {
case 0x9:case 0xa:case 0xd:    return true;
default:  return ((0x20 <= c && c <= 0xd7ff) || (0xe000 <= c && c <= 0xfffd) || (0x10000 <= c && c <= 0x10ffff));
}
}
  boolean __target__(char c){
switch (c) {
case 0x9:case 0xa:case 0xd:    return true;
default:  return ((0x20 <= c && c <= 0xd7ff) || (0xe000 <= c && c < 0xfffd) || (0x10000 <= c && c <= 0x10ffff));
}
}

}