import java.util.*;

public class Target {

boolean arraysIdenticalOrNull(boolean[] ba,boolean[] ba2){
  if (ba.length == 0 && ba2.length == 0)   return true;
  if (ba.length != ba2.length)   return false;
  int c=ba.length;
  for (int i=0; i < c; i++)   if (!(ba[i] == ba2[i]))   return false;
  return true;
}
  boolean __target__(boolean[] ba,boolean[] ba2){
  if (ba.length == 0 && ba2.length == 0)   return true;
  if (ba.length != ba2.length)   return false;
  int c=ba.length;
  for (int i=0; i < c; i++)   if (!(ba[i] != ba2[i]))   return false;
  return true;
}

}