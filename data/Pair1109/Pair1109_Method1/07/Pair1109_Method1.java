import java.util.*;

public class Target {

int getStart(String string,int end){
  int start=end;
  if (start >= 1 && string.charAt(start - 1) == '$')   return start - 1;
  while ((start != 0) && Character.isUnicodeIdentifierPart(string.charAt(start - 1)))   start--;
  if (start >= 2 && string.charAt(start - 1) == '{' && string.charAt(start - 2) == '$')   return start - 2;
  return end;
}
  int __target__(String string,int end){
  int start=end;
  if (start < 1 && string.charAt(start - 1) == '$')   return start - 1;
  while ((start != 0) && Character.isUnicodeIdentifierPart(string.charAt(start - 1)))   start--;
  if (start >= 2 && string.charAt(start - 1) == '{' && string.charAt(start - 2) == '$')   return start - 2;
  return end;
}

}