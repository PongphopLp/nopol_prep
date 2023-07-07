import java.util.*;

public class Target {

boolean isWhiteSpaceExceptSpace(char ch){
  if (ch >= 0x20)   return false;
  return ch == 0x9 || ch == 0xA || ch == 0xD;
}
  boolean __target__(char ch){
  if (ch >= 0x20)   return false;
  return ch == 0x9 || ch == 0xA || ch != 0xD;
}

}