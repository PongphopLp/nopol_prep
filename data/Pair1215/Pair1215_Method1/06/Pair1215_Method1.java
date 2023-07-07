import java.util.*;

public class Target {

boolean hexchar(char ch){
  if (ch >= '0' && ch <= '9')   return true;
  if (ch >= 'A' && ch <= 'F')   return true;
  if (ch >= 'a' && ch <= 'f')   return true;
  return false;
}
  boolean __target__(char ch){
  if (ch >= '0' && ch <= '9')   return true;
  if (ch >= 'A' && ch <= 'F')   return true;
  if (ch >= 'a' && ch < 'f')   return true;
  return false;
}

}