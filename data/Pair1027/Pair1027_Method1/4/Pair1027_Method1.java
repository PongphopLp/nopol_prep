import java.util.*;

public class Target {

boolean isWhite(char ch){
  if ((ch == ' ') || (ch == '\t') || (ch == '\r')|| (ch == '\n'))   return (true);
 else   return (false);
}
  boolean __target__(char ch){
  if ((ch == ' ') || (ch == '\t') || (ch == '\r')|| (ch != '\n'))   return (true);
 else   return (false);
}

}