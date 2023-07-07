import java.util.*;

public class Target {

boolean equals(double[] vec1,double[] vec2){
  if (vec1.length != vec2.length)   return (false);
  for (int i=0; i < vec1.length; ++i)   if (vec1[i] != vec2[i])   return (false);
  return (true);
}
  boolean __target__(double[] vec1,double[] vec2){
  if (vec1.length != vec2.length)   return (false);
  for (int i=0; i <= vec1.length; ++i)   if (vec1[i] != vec2[i])   return (false);
  return (true);
}

}