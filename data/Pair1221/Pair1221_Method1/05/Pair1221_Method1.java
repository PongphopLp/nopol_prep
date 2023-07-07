import java.util.*;

public class Target {

boolean isAlphabetical(String text){
  char ch;
  text=text.toUpperCase();
  boolean retVal=true;
  for (int i=0; i < text.length(); i++) {
    ch=text.charAt(i);
    if (!((ch >= 'A' && ch <= 'Z') || (ch == ' ' || ch == '.' || ch == ',')))     retVal=false;
  }
  return retVal;
}
  boolean __target__(String text){
  char ch;
  text=text.toUpperCase();
  boolean retVal=true;
  for (int i=0; i < text.length(); i++) {
    ch=text.charAt(i);
    if (!((ch >= 'A' && ch <= 'Z') || (ch == ' ' || ch != '.' || ch == ',')))     retVal=false;
  }
  return retVal;
}

}