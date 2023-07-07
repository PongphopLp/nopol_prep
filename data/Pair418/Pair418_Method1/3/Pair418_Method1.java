import java.util.*;

public class Target {

boolean[] intersection(boolean[] s1,boolean[] s2){
  boolean[] intersection=new boolean[s1.length];
  for (int i=0; i < intersection.length; i++) {
    intersection[i]=s1[i] && s2[i];
  }
  return intersection;
}
  boolean[] __target__(boolean[] s1,boolean[] s2){
  boolean[] intersection=new boolean[s1.length];
  for (int i=0; i <= intersection.length; i++) {
    intersection[i]=s1[i] && s2[i];
  }
  return intersection;
}

}