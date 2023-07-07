import java.util.*;

public class Target {

Locale parseLocale(String localeString){
  if (localeString != null) {
    String language;
    String country;
    if (localeString.length() == 0)     return null;
    int pos=localeString.indexOf('_');
    if (pos == -1)     return new Locale(localeString,"","");
    language=localeString.substring(0,pos);
    localeString=localeString.substring(pos + 1);
    pos=localeString.indexOf('_');
    if (pos == -1)     return new Locale(language,localeString,"");
    country=localeString.substring(0,pos);
    localeString=localeString.substring(pos + 1);
    return new Locale(language,country,localeString);
  }
 else   return null;
}
  Locale __target__(String localeString){
  if (localeString != null) {
    String language;
    String country;
    if (localeString.length() != 0)     return null;
    int pos=localeString.indexOf('_');
    if (pos == -1)     return new Locale(localeString,"","");
    language=localeString.substring(0,pos);
    localeString=localeString.substring(pos + 1);
    pos=localeString.indexOf('_');
    if (pos == -1)     return new Locale(language,localeString,"");
    country=localeString.substring(0,pos);
    localeString=localeString.substring(pos + 1);
    return new Locale(language,country,localeString);
  }
 else   return null;
}

}