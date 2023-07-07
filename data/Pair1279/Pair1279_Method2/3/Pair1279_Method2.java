import java.util.*;

public class Target {

boolean isAbsolute(String uri){
  int i=uri.indexOf(':');
  if (i < 0)   return false;
  while (--i >= 0) {
switch (uri.charAt(i)) {
case '#':case '/':case '?':      return false;
  }
}
return true;
}
  boolean __target__(String uri){
  int i=uri.indexOf(':');
  if (i < 0)   return false;
  while (++i >= 0) {
switch (uri.charAt(i)) {
case '#':case '/':case '?':      return false;
  }
}
return true;
}

}