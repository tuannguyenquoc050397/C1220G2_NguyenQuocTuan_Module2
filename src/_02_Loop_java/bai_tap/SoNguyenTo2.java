package _02_Loop_java.bai_tap;

public class SoNguyenTo2 {
    public static void main(String[] args) {
        byte N=2;
        while (N<100){
            boolean check=true;
            for (byte i=2;i<N;i++){
                if(N%i==0){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.println(N);
            }
            N++;
        }
    }
}
