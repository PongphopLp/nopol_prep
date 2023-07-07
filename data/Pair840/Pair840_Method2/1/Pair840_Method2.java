import java.util.*;

public class Target {

boolean equals(String s1,String s2){
  if (s1 == null || s2 == null)   return (s1 == s2);
 else   return s1.compareTo(s2) == 0;
}
  boolean __target__(String s1,String s2){
  if (s1 != null || s2 == null)   return (s1 == s2);
 else   return s1.compareTo(s2) == 0;
}

}