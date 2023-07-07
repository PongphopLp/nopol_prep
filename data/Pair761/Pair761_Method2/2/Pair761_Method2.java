import java.util.*;

public class Target {

boolean isEqual(String string1,String string2){
  boolean bIsEmpty1=(string1 == null || string1.length() == 0);
  boolean bIsEmpty2=(string2 == null || string2.length() == 0);
  if (bIsEmpty1 && bIsEmpty2)   return true;
  if (bIsEmpty1 || bIsEmpty2)   return false;
  return string1.equals(string2);
}
  boolean __target__(String string1,String string2){
  boolean bIsEmpty1=(string1 == null || string1.length() != 0);
  boolean bIsEmpty2=(string2 == null || string2.length() == 0);
  if (bIsEmpty1 && bIsEmpty2)   return true;
  if (bIsEmpty1 || bIsEmpty2)   return false;
  return string1.equals(string2);
}

}