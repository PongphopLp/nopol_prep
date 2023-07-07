import java.util.*;

public class Target {

boolean contentEquals(byte[] content1,byte[] content2){
  if (content1 == null)   return (content2 == null);
  if (content1.length != content2.length)   return false;
  for (int i=0; i < content1.length; i++)   if (content1[i] != content2[i])   return false;
  return true;
}
  boolean __target__(byte[] content1,byte[] content2){
  if (content1 == null)   return (content2 == null);
  if (content1.length != content2.length)   return false;
  for (int i=0; i < content1.length; i++)   if (content1[i] == content2[i])   return false;
  return true;
}

}