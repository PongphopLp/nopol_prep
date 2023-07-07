import java.util.*;

public class Target {

char close(char c){
  if (c == '<')   return '>';
  if (c == '[')   return ']';
  if (c == '(')   return ')';
  if (c == '{')   return '}';
  return c;
}
  char __target__(char c){
  if (c == '<')   return '>';
  if (c == '[')   return ']';
  if (c == '(')   return ')';
  if (c != '{')   return '}';
  return c;
}

}