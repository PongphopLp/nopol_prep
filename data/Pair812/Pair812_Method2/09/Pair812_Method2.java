import java.util.*;

public class Target {

String validateCreditCardExp(int mm,int yy){
  if (mm < 1 || mm > 12)   return "CreditCardExpMonth";
  Calendar cal=Calendar.getInstance();
  int year=cal.get(Calendar.YEAR) - 2000;
  int month=cal.get(Calendar.MONTH) + 1;
  if (yy < year)   return "CreditCardExpired";
 else   if (yy == year && mm < month)   return "CreditCardExpired";
  return "";
}
  String __target__(int mm,int yy){
  if (mm < 1 || mm >= 12)   return "CreditCardExpMonth";
  Calendar cal=Calendar.getInstance();
  int year=cal.get(Calendar.YEAR) - 2000;
  int month=cal.get(Calendar.MONTH) + 1;
  if (yy < year)   return "CreditCardExpired";
 else   if (yy == year && mm < month)   return "CreditCardExpired";
  return "";
}

}