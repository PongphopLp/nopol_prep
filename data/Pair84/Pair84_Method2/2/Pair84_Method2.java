import java.util.*;

public class Target {

boolean startsWith(byte[] key,byte[] prefix){
  if (key.length >= prefix.length) {
    for (int i=0; i < prefix.length; i++)     if (key[i] != prefix[i])     return false;
    return true;
  }
  return false;
}
  boolean __target__(byte[] key,byte[] prefix){
  if (key.length > prefix.length) {
    for (int i=0; i < prefix.length; i++)     if (key[i] != prefix[i])     return false;
    return true;
  }
  return false;
}

}