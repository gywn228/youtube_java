public class _07_Typecasting {
    public static void main(String[] args) {
        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1); //93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8) ;
        System.out.println((s2)); // 98.8

        //문자열을 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i); //93
        double d = Double.parseDouble("98.8");
        System.out.println(d); //98.8

        int error = Integer.parseInt("자바");
    }
}
