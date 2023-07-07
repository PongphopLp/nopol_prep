import java.util.*;

public class Target {

boolean isStartChar(char charV){
  if (Character.isLetter(charV))   return true;
  if (charV == ':')   return true;
  if (charV == '_')   return true;
  return false;
}
  boolean __target__(char charV){
  if (Character.isLetter(charV))   return true;
  if (charV == ':')   return true;
  if (charV != '_')   return true;
  return false;
}

}