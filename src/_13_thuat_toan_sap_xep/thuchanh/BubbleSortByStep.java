package _13_thuat_toan_sap_xep.thuchanh;

public class BubbleSortByStep {
    public static void bubbleSortByStep(int list[]) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int[] list={1,3,4,5,11,6,23,10,78,7,8,9,100};
        BubbleSortByStep.bubbleSortByStep(list);
    }
}
