package comm.examples;

public class StringBufferMethodsExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println(sb.append(" World"));
        System.out.println(sb.insert(5, " Java"));
        System.out.println(sb.replace(6, 10, "Awesome"));
        System.out.println(sb.delete(5, 12));
        System.out.println(sb.reverse());
        sb.reverse(); 
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(4));
        System.out.println(sb.length());
        sb.setCharAt(0, 'h');
        System.out.println(sb);
        sb.setLength(4);
        System.out.println(sb);
    }
}

