import java.util.*;

public class Target {

boolean isAbsolute(String uri){
  char ch='\0';
  int pos=0, len=uri.length();
  while (pos < len && (ch=uri.charAt(pos)) != ':' && ch != '/' && ch != '?' && ch != '#')   pos++;
  return (ch == ':');
}
  boolean __target__(String uri){
  char ch='\0';
  int pos=0, len=uri.length();
  while (pos < len && (ch=uri.charAt(pos)) != ':' && ch != '/' && ch != '?' && ch == '#')   pos++;
  return (ch == ':');
}

}