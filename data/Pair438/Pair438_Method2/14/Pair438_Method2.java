import java.util.*;

public class Target {

boolean isXMLCharacter(int c){
  if (c == '\n')   return true;
  if (c == '\r')   return true;
  if (c == '\t')   return true;
  if (c < 0x20)   return false;
  if (c <= 0xD7FF)   return true;
  if (c < 0xE000)   return false;
  if (c <= 0xFFFD)   return true;
  if (c < 0x10000)   return false;
  if (c <= 0x10FFFF)   return true;
  return false;
}
  boolean __target__(int c){
  if (c == '\n')   return true;
  if (c == '\r')   return true;
  if (c == '\t')   return true;
  if (c < 0x20)   return false;
  if (c <= 0xD7FF)   return true;
  if (c < 0xE000)   return false;
  if (c <= 0xFFFD)   return true;
  if (c <= 0x10000)   return false;
  if (c <= 0x10FFFF)   return true;
  return false;
}

}