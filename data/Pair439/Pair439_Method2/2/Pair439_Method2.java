import java.util.*;

public class Target {

int __skipNonWhitespace(char[] cToken,int start){
  while (start < cToken.length && !Character.isWhitespace(cToken[start]))   ++start;
  return start;
}
  int __target__(char[] cToken,int start){
  while (start < cToken.length && !Character.isWhitespace(cToken[start]))   --start;
  return start;
}

}