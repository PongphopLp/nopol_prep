import java.util.*;

public class Target {

byte valueForHexDigit(char c){
  if (c >= '0' && c <= '9')   return (byte)(c - '0');
  if (c >= 'a' && c <= 'f')   return (byte)((c - 'a') + 10);
  if (c >= 'A' && c <= 'F')   return (byte)((c - 'A') + 10);
  return 0;
}
  byte __target__(char c){
  if (c >= '0' && c <= '9')   return (byte)(c - '0');
  if (c < 'a' && c <= 'f')   return (byte)((c - 'a') + 10);
  if (c >= 'A' && c <= 'F')   return (byte)((c - 'A') + 10);
  return 0;
}

}