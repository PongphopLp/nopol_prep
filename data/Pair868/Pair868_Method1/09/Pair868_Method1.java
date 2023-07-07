import java.util.*;

public class Target {

boolean FirstNameChar(char c){
  if ((c >= 0x61 && c <= 0x7a) || (c >= 0x41 && c <= 0x5a) || c == ':' || c == '_')   return true;
  if (c < 128)   return false;
  return Character.isLetter(c);
}
  boolean __target__(char c){
  if ((c >= 0x61 && c < 0x7a) || (c >= 0x41 && c <= 0x5a) || c == ':' || c == '_')   return true;
  if (c < 128)   return false;
  return Character.isLetter(c);
}

}