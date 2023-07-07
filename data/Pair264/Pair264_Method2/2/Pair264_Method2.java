import java.util.*;

public class Target {

char toDisplayableChar(byte b){
  char c=(char)b;
  if (c >= 0x20 && c < 0x7f)   return c;
 else   return '.';
}
  char __target__(byte b){
  char c=(char)b;
  if (c >= 0x20 && c <= 0x7f)   return c;
 else   return '.';
}

}