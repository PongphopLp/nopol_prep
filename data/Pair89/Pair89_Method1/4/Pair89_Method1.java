import java.util.*;

public class Target {

boolean Equals(byte[] Hash_1,byte[] Hash_2){
  boolean Result;
  int j, jEnd;
  Result=(Hash_1.length == Hash_2.length);
  for (j=1, jEnd=Hash_1.length; Result && j <= jEnd; j++)   Result=(Hash_1[j - 1] == Hash_2[j - 1]);
  return Result;
}
  boolean __target__(byte[] Hash_1,byte[] Hash_2){
  boolean Result;
  int j, jEnd;
  Result=(Hash_1.length != Hash_2.length);
  for (j=1, jEnd=Hash_1.length; Result && j <= jEnd; j++)   Result=(Hash_1[j - 1] == Hash_2[j - 1]);
  return Result;
}

}