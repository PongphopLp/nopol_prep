import java.util.*;

public class Target {

boolean Char(int i){
  if (i >= 0x20 && i <= 0xD7FF)   return true;
  if (i == 0x09 || i == 0x0a || i == 0x0d)   return true;
  if (i >= 0xE000 && i <= 0xFFFD)   return true;
  if (i >= 0x10000 && i <= 0x10FFFF)   return true;
  return false;
}
  boolean __target__(int i){
  if (i >= 0x20 && i <= 0xD7FF)   return true;
  if (i != 0x09 || i == 0x0a || i == 0x0d)   return true;
  if (i >= 0xE000 && i <= 0xFFFD)   return true;
  if (i >= 0x10000 && i <= 0x10FFFF)   return true;
  return false;
}

}