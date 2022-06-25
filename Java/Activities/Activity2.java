package activities;

public class Activity2 {

    public static void main(String[] args) {

        int array[] = {10,77,10,54,-11,10};
        int sum=0;

        for(int i=0;i< array.length;i++){

            if(array[i]%10==0){

                sum=sum+array[i];
            }
        }

        if(sum==30){

            System.out.println("Sum is calculated correctly="+sum);
        }
        else
            System.out.println("Sum is not calculated correctly");
    }
}
