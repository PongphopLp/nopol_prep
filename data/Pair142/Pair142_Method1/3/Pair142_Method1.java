import java.util.*;

public class Target {

boolean equalsByteArray(byte[] p_source,byte[] p_destination){
  if ((null == p_source) || (null == p_destination) || (p_source.length != p_destination.length))   return false;
  for (int i=0; i < p_source.length; i++)   if (p_destination[i] != p_source[i])   return false;
  return true;
}
  boolean __target__(byte[] p_source,byte[] p_destination){
  if ((null == p_source) || (null == p_destination) || (p_source.length == p_destination.length))   return false;
  for (int i=0; i < p_source.length; i++)   if (p_destination[i] != p_source[i])   return false;
  return true;
}

}