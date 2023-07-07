import java.util.*;

public class Target {

boolean matchesMagic(byte[] magic,byte[] buffer){
  for (int i=0; i < magic.length; i++)   if (buffer[i] != magic[i])   return false;
  return true;
}
  boolean __target__(byte[] magic,byte[] buffer){
  for (int i=0; i < magic.length; i++)   if (buffer[i] == magic[i])   return false;
  return true;
}

}