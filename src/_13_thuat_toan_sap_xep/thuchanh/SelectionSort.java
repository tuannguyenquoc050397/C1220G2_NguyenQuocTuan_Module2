package _13_thuat_toan_sap_xep.thuchanh;

public class SelectionSort {
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        for (double i:list){
            System.out.print(i+"  ");
        }
    }
    public static void main(String[] args) {
        double[] list={1,3,4,5,11,6,23,10,78,7,8,9,100};
        SelectionSort.selectionSort(list);
    }
}
