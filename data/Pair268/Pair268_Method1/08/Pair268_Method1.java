import java.util.*;

public class Target {

List<Locale> getCandidateLocales(Locale locale){
  String language=locale.getLanguage();
  String country=locale.getCountry();
  String variant=locale.getVariant();
  List<Locale> locales=new ArrayList<Locale>(4);
  if (variant.length() > 0) {
    locales.add(locale);
  }
  if (country.length() > 0) {
    locales.add(locales.size() == 0 ? locale : new Locale(language,country,""));
  }
  if (language.length() > 0) {
    locales.add(locales.size() == 0 ? locale : new Locale(language,"",""));
  }
  return locales;
}
  List<Locale> getCandidateLocales(Locale locale){
  String language=locale.getLanguage();
  String country=locale.getCountry();
  String variant=locale.getVariant();
  List<Locale> locales=new ArrayList<Locale>(4);
  if (variant.length() > 0) {
    locales.add(locale);
  }
  if (country.length() <= 0) {
    locales.add(locales.size() == 0 ? locale : new __target__(language,country,""));
  }
  if (language.length() > 0) {
    locales.add(locales.size() == 0 ? locale : new Locale(language,"",""));
  }
  return locales;
}

}