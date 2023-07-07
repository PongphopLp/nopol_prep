import java.util.*;

public class Target {

boolean isWovel(char c){
  if (!Character.isLetter(c))   return false;
  return ((c == 'e') || (c == 'y') || (c == 'u')|| (c == 'i')|| (c == 'o')|| (c == 'a')|| (c == '�')|| (c == '�')|| (c == '�'));
}
  boolean __target__(char c){
  if (!Character.isLetter(c))   return false;
  return ((c == 'e') || (c == 'y') || (c == 'u')|| (c == 'i')|| (c != 'o')|| (c == 'a')|| (c == '�')|| (c == '�')|| (c == '�'));
}

}