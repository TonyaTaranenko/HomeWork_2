package homework2;

public class Part_1
{
    public static void main(String[] args)
    {
        int[] mas = new int[15];
        int i;
        i = 0;
        for (int j=0; j<mas.length; j++)
        {
            mas[j] = (int)(Math.random()*10);
        }

        System.out.print("Массив: ");

        for (int j=0; j<mas.length; j++)
        {
            if (mas[j]%2==0)
            {
                i++;
            }

            System.out.print(mas[j]+" ");
        }
        System.out.println("\nКоличество четных элементов в массиве: " +i);
    }
}
