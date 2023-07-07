import java.util.*;

public class Target {

Locale toLocale(String language){
  if ((language == null) || (language.length() == 0)) {
    return null;
  }
  final StringTokenizer stt=new StringTokenizer(language,"_",true);
  final String lang=stt.nextToken();
  if (stt.hasMoreTokens()) {
    stt.nextToken();
  }
  if (!stt.hasMoreTokens()) {
    return new Locale(lang);
  }
  String country=stt.nextToken();
  if (country.equals("_")) {
    country="";
  }
 else   if (stt.hasMoreTokens()) {
    stt.nextToken();
  }
  if (!stt.hasMoreTokens()) {
    return new Locale(lang,country);
  }
  final String variant=stt.nextToken();
  return new Locale(lang,country,variant);
}
  Locale __target__(String language){
  if ((language != null) || (language.length() == 0)) {
    return null;
  }
  final StringTokenizer stt=new StringTokenizer(language,"_",true);
  final String lang=stt.nextToken();
  if (stt.hasMoreTokens()) {
    stt.nextToken();
  }
  if (!stt.hasMoreTokens()) {
    return new Locale(lang);
  }
  String country=stt.nextToken();
  if (country.equals("_")) {
    country="";
  }
 else   if (stt.hasMoreTokens()) {
    stt.nextToken();
  }
  if (!stt.hasMoreTokens()) {
    return new Locale(lang,country);
  }
  final String variant=stt.nextToken();
  return new Locale(lang,country,variant);
}

}