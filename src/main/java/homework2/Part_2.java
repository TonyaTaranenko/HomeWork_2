package homework2;

public class Part_2
{
    private static void pr(){
        System.out.println();
    }
    private static int rand(int a, int b) {
        return (int)(Math.random()*(b-a+1)+(a));
    }
    private static void arr(int[] mas) {
        for(int i=0; i<mas.length; i++) {
            System.out.print(mas[i]+" ");
        }
    }
    private static void sort(int[] a) {
        for (int i = a.length - 1; i >= 2; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    sorted = false;
                }
            }
            if(sorted) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] mas = new int[10];
        int a = 10, b = 15;
        for(int i=0; i<mas.length; i++) {
            mas[i] = rand(a, b);
        }
        arr(mas);
        sort(mas);
        pr();
        arr(mas);
    }
}



