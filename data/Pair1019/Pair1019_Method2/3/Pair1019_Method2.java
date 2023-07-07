import java.util.*;

public class Target {

boolean isValidConjunction(int[] features){
  for (int i=1; i < features.length; i++)   if (features[i - 1] >= features[i])   return false;
  return true;
}
  boolean __target__(int[] features){
  for (int i=1; i >= features.length; i++)   if (features[i - 1] >= features[i])   return false;
  return true;
}

}