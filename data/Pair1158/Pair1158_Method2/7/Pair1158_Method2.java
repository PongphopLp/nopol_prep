import java.util.*;

public class Target {

boolean equals(int first[],int second[]){
  if (first == null || second == null)   return false;
 else   if (first.length != second.length)   return false;
 else {
    int c=0;
    for (; c < first.length && first[c] == second[c]; c++)     ;
    return (c >= first.length);
  }
}
  boolean __target__(int first[],int second[]){
  if (first == null || second == null)   return false;
 else   if (first.length != second.length)   return false;
 else {
    int c=0;
    for (; c < first.length && first[c] == second[c]; c--)     ;
    return (c >= first.length);
  }
}

}