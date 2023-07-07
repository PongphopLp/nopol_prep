import java.util.*;

public class Target {

boolean checkDate(Date callStartDate,Date sinceDate,Date untilDate){
  if (sinceDate != null)   if (callStartDate.before(sinceDate))   return false;
  if (untilDate != null)   if (callStartDate.after(untilDate))   return false;
  return true;
}
  boolean __target__(Date callStartDate,Date sinceDate,Date untilDate){
  if (sinceDate != null)   if (callStartDate.before(sinceDate))   return false;
  if (untilDate == null)   if (callStartDate.after(untilDate))   return false;
  return true;
}

}