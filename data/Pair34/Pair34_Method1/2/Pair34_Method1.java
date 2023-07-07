import java.util.*;

public class Target {

boolean matches(byte[] header,byte[] suggestedEncodingBytes){
  if (header.length < suggestedEncodingBytes.length)   return false;
  for (int i=0; i < suggestedEncodingBytes.length; i++)   if (header[i] != suggestedEncodingBytes[i])   return false;
  return true;
}
  boolean __target__(byte[] header,byte[] suggestedEncodingBytes){
  if (header.length <= suggestedEncodingBytes.length)   return false;
  for (int i=0; i < suggestedEncodingBytes.length; i++)   if (header[i] != suggestedEncodingBytes[i])   return false;
  return true;
}

}