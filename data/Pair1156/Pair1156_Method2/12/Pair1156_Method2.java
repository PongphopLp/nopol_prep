import java.util.*;

public class Target {

boolean check(char character){
  boolean check=false;
  if (character >= '0' && character <= '9')   check=true;
 else   if (character >= 'A' && character <= 'Z')   check=true;
 else   if (character >= 'a' && character <= 'z')   check=true;
  return check;
}
  boolean __target__(char character){
  boolean check=false;
  if (character >= '0' && character <= '9')   check=true;
 else   if (character >= 'A' && character <= 'Z')   check=true;
 else   if (character >= 'a' && character > 'z')   check=true;
  return check;
}

}