package utilidade;

public class Util {

    public static String toCamelCase(String str) {
        StringBuilder result = new StringBuilder();
        for (String part : str.split("_")) {
            result.append(part.substring(0, 1).toUpperCase()).append(part.substring(1).toLowerCase());
        }
        return result.toString();
    }

    public static String getJavaType(String sqlType) {
        switch (sqlType.toUpperCase()) {
            case "INT":
                return "int";
            case "VARCHAR":
                return "String";
            case "FLOAT":
                return "float";
            case "DOUBLE":
                return "double";
            case "DATE":
                return "java.sql.Date";
            default:
                return "String";
        }
    }
}

