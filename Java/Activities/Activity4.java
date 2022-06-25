package activities;

public class Activity4 {

    public static void main(String[] args) {

        int[] num={7,2,9,1,0,5,20};

        System.out.println("Before Sorting:");
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+",");
        }
        System.out.println("After Sorting:");

        for (int i = 1; i < num.length; i++) {
            int key = num[i];
            int j = i - 1;
            while (j >= 0 && num[j] > key) {
                num[j + 1] = num[j];
                j = j - 1;
            }
             num[j + 1] = key;
        }

        for(int i=num.length-1;i>=0;i--){
            System.out.print(num[i]+",");
        }

    }
}
