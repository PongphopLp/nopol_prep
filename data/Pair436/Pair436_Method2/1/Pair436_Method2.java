import java.util.*;

public class Target {

int __skipDigits(char[] cToken,int start){
  while (start < cToken.length && Character.isDigit(cToken[start]))   ++start;
  return start;
}
  int __target__(char[] cToken,int start){
  while (start <= cToken.length && Character.isDigit(cToken[start]))   ++start;
  return start;
}

}