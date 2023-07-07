import java.util.*;

public class Target {

String dechomp(String sSource,char cEndsWith){
  if (null == sSource)   return null;
 else   if (sSource.length() < 1)   return sSource;
 else   if (sSource.charAt(sSource.length() - 1) == cEndsWith)   return sSource.substring(0,sSource.length() - 1);
 else   return sSource;
}
  String __target__(String sSource,char cEndsWith){
  if (null != sSource)   return null;
 else   if (sSource.length() < 1)   return sSource;
 else   if (sSource.charAt(sSource.length() - 1) == cEndsWith)   return sSource.substring(0,sSource.length() - 1);
 else   return sSource;
}

}