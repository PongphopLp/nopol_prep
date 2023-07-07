import java.util.*;

public class Target {

boolean equals(byte[] name1,byte[] name2){
  if (name1.length != name2.length)   return false;
  if (name1 == name2)   return true;
  for (int i=name1.length; --i >= 0; )   if (name1[i] != name2[i])   return false;
  return true;
}
  boolean __target__(byte[] name1,byte[] name2){
  if (name1.length != name2.length)   return false;
  if (name1 == name2)   return true;
  for (int i=name1.length; ++i >= 0; )   if (name1[i] != name2[i])   return false;
  return true;
}

}