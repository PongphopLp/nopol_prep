import java.util.*;

public class Target {

boolean isWhiteSpace(char ch){
  if (ch > 0x20)   return false;
  return ch == 0x9 || ch == 0xA || ch == 0xD || ch == 0x20;
}
  boolean __target__(char ch){
  if (ch > 0x20)   return false;
  return ch == 0x9 || ch == 0xA || ch != 0xD || ch == 0x20;
}

}