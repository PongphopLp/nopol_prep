import java.util.*;

public class Target {

boolean equals(Date data1,Date data2){
  if (data1 == null && data2 == null)   return true;
  if ((data1 != null && data2 == null) || (data1 == null && data2 != null))   return false;
  return (data1.compareTo(data2) == 0);
}
  boolean __target__(Date data1,Date data2){
  if (data1 == null && data2 == null)   return true;
  if ((data1 != null && data2 == null) || (data1 == null && data2 != null))   return false;
  return (data1.compareTo(data2) != 0);
}

}