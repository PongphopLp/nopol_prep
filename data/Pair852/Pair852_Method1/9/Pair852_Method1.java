import java.util.*;

public class Target {

boolean endsWith(StringBuffer buf,String s){
  int iBuf=buf.length();
  int iS=s.length();
  while (--iS >= 0 && --iBuf >= 0 && buf.charAt(iBuf) == s.charAt(iS)) {
  }
  return iS < 0;
}
  boolean __target__(StringBuffer buf,String s){
  int iBuf=buf.length();
  int iS=s.length();
  while (--iS >= 0 && --iBuf >= 0 && buf.charAt(iBuf) == s.charAt(iS)) {
  }
  return iS >= 0;
}

}