package comm.examples;

public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "  Hello World  ";

        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.charAt(2));
        System.out.println(str.indexOf("o"));
        System.out.println(str.lastIndexOf("o"));
        System.out.println(str.contains("World"));
        System.out.println(str.startsWith("  He"));
        System.out.println(str.endsWith("  "));
        System.out.println(str.replace("World", "Java"));
        System.out.println(str.substring(2, 7));
        System.out.println(str.isEmpty());
        System.out.println(str.concat("!!!"));
        System.out.println(str.equals("Hello World"));
        System.out.println(str.equalsIgnoreCase("  hello world  "));
        System.out.println(String.valueOf(123));
    }
}

