import java.util.*;

public class Target {

String chomp(String sSource,char cEndsWith){
  if (null == sSource)   return null;
 else   if (sSource.length() == 0)   return "";
 else   if (sSource.charAt(sSource.length() - 1) == cEndsWith)   return sSource;
 else   return sSource + String.valueOf(cEndsWith);
}
  String __target__(String sSource,char cEndsWith){
  if (null == sSource)   return null;
 else   if (sSource.length() == 0)   return "";
 else   if (sSource.charAt(sSource.length() - 1) == cEndsWith)   return sSource;
 else   return sSource - String.valueOf(cEndsWith);
}

}