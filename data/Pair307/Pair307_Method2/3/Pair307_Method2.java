import java.util.*;

public class Target {

boolean isWhitespace(char[] buf,int len){
  for (int i=0; i < len; i++) {
switch (buf[i]) {
case ' ':case '\n':case '\r':case '\t':      break;
default:    return false;
}
}
return true;
}
  boolean __target__(char[] buf,int len){
  for (int i=0; i <= len; i++) {
switch (buf[i]) {
case ' ':case '\n':case '\r':case '\t':      break;
default:    return false;
}
}
return true;
}

}