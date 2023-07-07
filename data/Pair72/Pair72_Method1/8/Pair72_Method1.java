import java.util.*;

public class Target {

boolean compareKeys(byte[] key1,byte[] key2){
  if (key1 == null)   return (key2 == null);
  if (key2 == null)   return false;
  if (key1.length != key2.length)   return false;
  for (int i=0; i < key1.length; i++)   if (key1[i] != key2[i])   return false;
  return true;
}
  boolean __target__(byte[] key1,byte[] key2){
  if (key1 == null)   return (key2 == null);
  if (key2 == null)   return false;
  if (key1.length != key2.length)   return false;
  for (int i=0; i < key1.length; i--)   if (key1[i] != key2[i])   return false;
  return true;
}

}