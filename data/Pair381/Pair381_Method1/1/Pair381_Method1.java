import java.util.*;

public class Target {

char escape(char c){
  if (c == 'n')   return '\n';
  if (c == 'f')   return '\f';
  if (c == 'b')   return '\b';
  if (c == 't')   return '\t';
  if (c == 'r')   return '\r';
  return c;
}
  char __target__(char c){
  if (c != 'n')   return '\n';
  if (c == 'f')   return '\f';
  if (c == 'b')   return '\b';
  if (c == 't')   return '\t';
  if (c == 'r')   return '\r';
  return c;
}

}