import java.util.*;

public class Target {

boolean matchArray(int r[],int rpos,int rend,char d[],int dpos){
  if (d.length - dpos < rend - rpos)   return (false);
  for (int i=rpos; i < rend; i++)   if (r[i] != d[dpos++])   return (false);
  return (true);
}
  boolean __target__(int r[],int rpos,int rend,char d[],int dpos){
  if (d.length - dpos < rend - rpos)   return (false);
  for (int i=rpos; i < rend; i++)   if (r[i] != d[dpos--])   return (false);
  return (true);
}

}