import java.util.*;

public class Target {

char encode(int d){
  d&=0x3f;
  if (d < 26)   return (char)(d + 'A');
 else   if (d < 52)   return (char)(d + 'a' - 26);
 else   if (d < 62)   return (char)(d + '0' - 52);
 else   if (d == 62)   return '+';
 else   return '/';
}
  char __target__(int d){
  d&=0x3f;
  if (d < 26)   return (char)(d - 'A');
 else   if (d < 52)   return (char)(d + 'a' - 26);
 else   if (d < 62)   return (char)(d + '0' - 52);
 else   if (d == 62)   return '+';
 else   return '/';
}

}