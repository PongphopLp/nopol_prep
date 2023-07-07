import java.util.*;

public class Target {

boolean rankBetween(char rank,char startRank,char endRank){
  if (rank > startRank && rank < endRank) {
    return true;
  }
 else   if (rank > endRank && rank < startRank) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(char rank,char startRank,char endRank){
  if (rank > startRank && rank <= endRank) {
    return true;
  }
 else   if (rank > endRank && rank < startRank) {
    return true;
  }
 else {
    return false;
  }
}

}