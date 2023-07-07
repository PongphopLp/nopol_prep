import java.util.*;

public class Target {

int getNumYears(Date dStart,Date dEnd){
  GregorianCalendar now=new GregorianCalendar();
  now.setTime(dEnd);
  int curYear=now.get(Calendar.YEAR);
  int curMonth=now.get(Calendar.MONTH) + 1;
  int curDay=now.get(Calendar.DAY_OF_MONTH);
  GregorianCalendar birthDate=new GregorianCalendar();
  birthDate.setTime(dStart);
  int birthYear=birthDate.get(Calendar.YEAR);
  int birthMonth=birthDate.get(Calendar.MONTH) + 1;
  int birthDay=birthDate.get(5);
  int ageInYears=curYear - birthYear;
  if (curMonth > birthMonth || curMonth == birthMonth && curDay >= birthDay) {
    ageInYears=curYear - birthYear;
  }
 else {
    ageInYears=curYear - birthYear - 1;
  }
  return ageInYears;
}
  int __target__(Date dStart,Date dEnd){
  GregorianCalendar now=new GregorianCalendar();
  now.setTime(dEnd);
  int curYear=now.get(Calendar.YEAR);
  int curMonth=now.get(Calendar.MONTH) + 1;
  int curDay=now.get(Calendar.DAY_OF_MONTH);
  GregorianCalendar birthDate=new GregorianCalendar();
  birthDate.setTime(dStart);
  int birthYear=birthDate.get(Calendar.YEAR);
  int birthMonth=birthDate.get(Calendar.MONTH) + 1;
  int birthDay=birthDate.get(5);
  int ageInYears=curYear + birthYear;
  if (curMonth > birthMonth || curMonth == birthMonth && curDay >= birthDay) {
    ageInYears=curYear - birthYear;
  }
 else {
    ageInYears=curYear - birthYear - 1;
  }
  return ageInYears;
}

}