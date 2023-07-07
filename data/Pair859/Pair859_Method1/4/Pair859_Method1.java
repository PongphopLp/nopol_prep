import java.util.*;

public class Target {

int charIndex(char[] buffer,int start,char c){
  for (int i=start; i < buffer.length; i++)   if (buffer[i] == c)   return i;
  return -1;
}
  int __target__(char[] buffer,int start,char c){
  for (int i=start; i >= buffer.length; i++)   if (buffer[i] == c)   return i;
  return -1;
}

}