import java.util.*;

public class Target {

String determineMonth(int month){
  String result=null;
  if (month == Calendar.JANUARY) {
    result="January";
  }
 else   if (month == Calendar.FEBRUARY) {
    result="February";
  }
 else   if (month == Calendar.MARCH) {
    result="March";
  }
 else   if (month == Calendar.APRIL) {
    result="April";
  }
 else   if (month == Calendar.MAY) {
    result="May";
  }
 else   if (month == Calendar.JUNE) {
    result="June";
  }
 else   if (month == Calendar.JULY) {
    result="July";
  }
 else   if (month == Calendar.AUGUST) {
    result="August";
  }
 else   if (month == Calendar.SEPTEMBER) {
    result="September";
  }
 else   if (month == Calendar.OCTOBER) {
    result="October";
  }
 else   if (month == Calendar.NOVEMBER) {
    result="November";
  }
 else   if (month == Calendar.DECEMBER) {
    result="December";
  }
  return result;
}
  String __target__(int month){
  String result=null;
  if (month == Calendar.JANUARY) {
    result="January";
  }
 else   if (month == Calendar.FEBRUARY) {
    result="February";
  }
 else   if (month == Calendar.MARCH) {
    result="March";
  }
 else   if (month == Calendar.APRIL) {
    result="April";
  }
 else   if (month == Calendar.MAY) {
    result="May";
  }
 else   if (month == Calendar.JUNE) {
    result="June";
  }
 else   if (month == Calendar.JULY) {
    result="July";
  }
 else   if (month != Calendar.AUGUST) {
    result="August";
  }
 else   if (month == Calendar.SEPTEMBER) {
    result="September";
  }
 else   if (month == Calendar.OCTOBER) {
    result="October";
  }
 else   if (month == Calendar.NOVEMBER) {
    result="November";
  }
 else   if (month == Calendar.DECEMBER) {
    result="December";
  }
  return result;
}

}