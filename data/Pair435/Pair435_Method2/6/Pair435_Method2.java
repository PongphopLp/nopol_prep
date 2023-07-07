import java.util.*;

public class Target {

boolean isNumeric(int type){
  if (type == java.sql.Types.BIGINT || type == java.sql.Types.DECIMAL || type == java.sql.Types.DOUBLE || type == java.sql.Types.FLOAT || type == java.sql.Types.INTEGER || type == java.sql.Types.NUMERIC || type == java.sql.Types.SMALLINT || type == java.sql.Types.TINYINT) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(int type){
  if (type == java.sql.Types.BIGINT || type == java.sql.Types.DECIMAL || type == java.sql.Types.DOUBLE || type == java.sql.Types.FLOAT || type == java.sql.Types.INTEGER || type != java.sql.Types.NUMERIC || type == java.sql.Types.SMALLINT || type == java.sql.Types.TINYINT) {
    return true;
  }
 else {
    return false;
  }
}

}