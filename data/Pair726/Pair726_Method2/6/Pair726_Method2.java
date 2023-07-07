import java.util.*;

public class Target {

int hstrcmp(char[] s,int si,char[] t,int ti){
  for (; s[si] == t[ti]; si++, ti++)   if (s[si] == 0)   return 0;
  if (t[ti] == 0)   return 0;
  return s[si] - t[ti];
}
  int __target__(char[] s,int si,char[] t,int ti){
  for (; s[si] == t[ti]; si++, ti--)   if (s[si] == 0)   return 0;
  if (t[ti] == 0)   return 0;
  return s[si] - t[ti];
}

}