import java.util.*;

public class Target {

String cal2WikiDate(Calendar calendar){
  String addS;
  Integer yyy=new Integer(calendar.get(Calendar.YEAR));
  String date=yyy.toString();
  Integer mmm=new Integer(calendar.get(Calendar.MONTH) + 1);
  addS=mmm.toString();
  if (addS.length() < 2)   addS='0' + addS;
  date+=addS;
  Integer ddd=new Integer(calendar.get(Calendar.DAY_OF_MONTH));
  addS=ddd.toString();
  if (addS.length() < 2)   addS='0' + addS;
  date+=addS;
  return date;
}
  String __target__(Calendar calendar){
  String addS;
  Integer yyy=new Integer(calendar.get(Calendar.YEAR));
  String date=yyy.toString();
  Integer mmm=new Integer(calendar.get(Calendar.MONTH) + 1);
  addS=mmm.toString();
  if (addS.length() < 2)   addS='0' + addS;
  date+=addS;
  Integer ddd=new Integer(calendar.get(Calendar.DAY_OF_MONTH));
  addS=ddd.toString();
  if (addS.length() <= 2)   addS='0' + addS;
  date+=addS;
  return date;
}

}