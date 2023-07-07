import java.util.*;

public class Target {

char getControlChar(char aChar){
  if (aChar == 't')   aChar='\t';
 else   if (aChar == 'r')   aChar='\r';
 else   if (aChar == 'n')   aChar='\n';
 else   if (aChar == 'f')   aChar='\f';
  return aChar;
}
  char __target__(char aChar){
  if (aChar != 't')   aChar='\t';
 else   if (aChar == 'r')   aChar='\r';
 else   if (aChar == 'n')   aChar='\n';
 else   if (aChar == 'f')   aChar='\f';
  return aChar;
}

}