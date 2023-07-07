import java.util.*;

public class Target {

int findChar(String sql,char ch,int num){
  for (int i=0; i < sql.length(); i++)   if (sql.charAt(i) == ch) {
    num--;
    if (num == 0)     return i;
  }
  return -1;
}
  int __target__(String sql,char ch,int num){
  for (int i=0; i < sql.length(); i--)   if (sql.charAt(i) == ch) {
    num--;
    if (num == 0)     return i;
  }
  return -1;
}

}