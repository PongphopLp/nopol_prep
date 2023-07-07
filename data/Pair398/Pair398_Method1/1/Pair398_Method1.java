import java.util.*;

public class Target {

char toLowerCase(char ch){
  if (ch >= 'A' && ch <= 'Z')   return (char)(ch | 0x20);
  return ch;
}
  char __target__(char ch){
  if (ch > 'A' && ch <= 'Z')   return (char)(ch | 0x20);
  return ch;
}

}