package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int x = 110;
        String kid = (x >= 120) ? "키가 " + x + "cm 이므로 탑승 가능 합니다" : "키가 " + x + "cm 이므로 탑승 불가능 합니다";
        System.out.println(kid);
    }
}
