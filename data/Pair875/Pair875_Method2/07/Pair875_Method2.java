import java.util.*;

public class Target {

char getBase64Char(int sixBit){
  if (sixBit < 26)   return (char)('A' + sixBit);
  if (sixBit < 52)   return (char)(('a' - 26) + sixBit);
  if (sixBit < 62)   return (char)(('0' - 52) + sixBit);
  if (sixBit == 62)   return '+';
  return '/';
}
  char __target__(int sixBit){
  if (sixBit < 26)   return (char)('A' + sixBit);
  if (sixBit < 52)   return (char)(('a' - 26) + sixBit);
  if (sixBit < 62)   return (char)(('0' - 52) - sixBit);
  if (sixBit == 62)   return '+';
  return '/';
}

}