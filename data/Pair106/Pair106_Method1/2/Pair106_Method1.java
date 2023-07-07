import java.util.*;

public class Target {

boolean startsWith(byte[] bytes,byte[] prefix){
  if (prefix.length > bytes.length)   return false;
  for (int i=0, n=prefix.length; i < n; ++i)   if (bytes[i] != prefix[i])   return false;
  return true;
}
  boolean __target__(byte[] bytes,byte[] prefix){
  if (prefix.length > bytes.length)   return false;
  for (int i=0, n=prefix.length; i <= n; ++i)   if (bytes[i] != prefix[i])   return false;
  return true;
}

}