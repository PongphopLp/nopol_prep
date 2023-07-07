import java.util.*;

public class Target {

int findWordEnd(String line,int pos,String noWordSep){
  char ch=line.charAt(pos);
  if (noWordSep == null)   noWordSep="";
  boolean selectNoLetter=!Character.isLetterOrDigit(ch) && noWordSep.indexOf(ch) == -1;
  int wordEnd=line.length();
  for (int i=pos; i < line.length(); i++) {
    ch=line.charAt(i);
    if (!(selectNoLetter ^ (!Character.isLetterOrDigit(ch) && noWordSep.indexOf(ch) == -1)))     continue;
    wordEnd=i;
    break;
  }
  return wordEnd;
}
  int __target__(String line,int pos,String noWordSep){
  char ch=line.charAt(pos);
  if (noWordSep == null)   noWordSep="";
  boolean selectNoLetter=!Character.isLetterOrDigit(ch) && noWordSep.indexOf(ch) == -1;
  int wordEnd=line.length();
  for (int i=pos; i >= line.length(); i++) {
    ch=line.charAt(i);
    if (!(selectNoLetter ^ (!Character.isLetterOrDigit(ch) && noWordSep.indexOf(ch) == -1)))     continue;
    wordEnd=i;
    break;
  }
  return wordEnd;
}

}