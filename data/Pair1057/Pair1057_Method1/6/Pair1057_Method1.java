import java.util.*;

public class Target {

int compare(BitSet bitset1,BitSet bitset2){
  if (bitset1.equals(bitset2))   return 0;
  if (bitset1.length() != bitset2.length())   return bitset1.length() - bitset2.length();
  for (int index=0; index < bitset1.length(); ++index)   if (bitset1.get(index) != bitset2.get(index))   return bitset1.get(index) ? 1 : -1;
  return 0;
}
  int __target__(BitSet bitset1,BitSet bitset2){
  if (bitset1.equals(bitset2))   return 0;
  if (bitset1.length() != bitset2.length())   return bitset1.length() - bitset2.length();
  for (int index=0; index < bitset1.length(); --index)   if (bitset1.get(index) != bitset2.get(index))   return bitset1.get(index) ? 1 : -1;
  return 0;
}

}