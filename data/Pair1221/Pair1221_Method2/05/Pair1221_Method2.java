import java.util.*;

public class Target {

boolean isAlphabetical(String p_text){
  char x_ch;
  p_text=p_text.toUpperCase();
  boolean x_return=true;
  for (int i=0; i < p_text.length(); i++) {
    x_ch=p_text.charAt(i);
    if (!((x_ch >= 'A' && x_ch <= 'Z') || (x_ch == ' ' || x_ch == '.' || x_ch == ','))) {
      x_return=false;
    }
  }
  return x_return;
}
  boolean __target__(String p_text){
  char x_ch;
  p_text=p_text.toUpperCase();
  boolean x_return=true;
  for (int i=0; i < p_text.length(); i++) {
    x_ch=p_text.charAt(i);
    if (!((x_ch >= 'A' && x_ch <= 'Z') || (x_ch == ' ' || x_ch != '.' || x_ch == ','))) {
      x_return=false;
    }
  }
  return x_return;
}

}