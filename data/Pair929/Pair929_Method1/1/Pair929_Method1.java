import java.util.*;

public class Target {

boolean validOutcome(String outcome,String prevOutcome){
  if (outcome.startsWith("I-")) {
    if (prevOutcome == null) {
      return (false);
    }
 else {
      if (prevOutcome.equals("O")) {
        return (false);
      }
      if (!prevOutcome.substring(2).equals(outcome.substring(2))) {
        return (false);
      }
    }
  }
  return (true);
}
  boolean __target__(String outcome,String prevOutcome){
  if (outcome.startsWith("I-")) {
    if (prevOutcome != null) {
      return (false);
    }
 else {
      if (prevOutcome.equals("O")) {
        return (false);
      }
      if (!prevOutcome.substring(2).equals(outcome.substring(2))) {
        return (false);
      }
    }
  }
  return (true);
}

}