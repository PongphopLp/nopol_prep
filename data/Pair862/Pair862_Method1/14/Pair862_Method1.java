import java.util.*;

public class Target {

boolean isXmlChar(char ch){
  if (ch == 0x9 || ch == 0xA || ch == 0xD)   return true;
  if ((0x20 <= ch) && (ch <= 0xD7FF))   return true;
  if ((0xE000 <= ch) && (ch <= 0xFFFD))   return true;
  if ((0x10000 <= ch) && (ch <= 0x10FFFF))   return true;
  return false;
}
  boolean __target__(char ch){
  if (ch == 0x9 || ch == 0xA || ch == 0xD)   return true;
  if ((0x20 <= ch) && (ch <= 0xD7FF))   return true;
  if ((0xE000 <= ch) && (ch <= 0xFFFD))   return true;
  if ((0x10000 > ch) && (ch <= 0x10FFFF))   return true;
  return false;
}

}