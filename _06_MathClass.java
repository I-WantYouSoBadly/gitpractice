public class _06_MathClass {
    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;
        double u = 10;

        double z = Math.max(x, y); //두 수중 더 큰 것을 고르는 메소드
        double m = Math.min(x,y); //더 작은것
        double n = Math.abs(y);//절댓값으로 변환
        double v = Math.sqrt(u);//근호를 씌운 값

        System.out.println(z);
        System.out.println(m);
        System.out.println(n);
        System.out.println(v);

    }
}
