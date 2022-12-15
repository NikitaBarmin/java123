import java.util.Scanner;

public class Second {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int array_size = 0, array[];

        System.out.print("Введите размеры массива: ");
        if(in.hasNextInt()){
            array_size = in.nextInt();
        }else{
            System.out.println("Размер массива должен быть задан целым числом, попробуйте снова:");
            System.exit(0);
        }
        if (array_size <=0){
            System.out.println("Размер массива должен быть больше 0, повторите попытку");
            System.exit(0);
        }
            array = new int[array_size];
        
        for(int i=0; i < array_size; i++){
            if(in.hasNextInt()){
                array[i] = in.nextInt();
            }else{
                System.out.println("Массив должен состоять из целых чисел, попробуйте еще раз");
                System.exit(0);
            }}
            System.out.println("Введите целое число, которое необходимо удалить из массива: ");
            if(in.hasNextInt()){
                    int x = in.nextInt();
                    System.out.println("Исходный массив: ");
                    for (int elem : array){
                        System.out.print(elem + " ");
                    }
                    System.out.println();
                    System.out.print("Масcив после обработки: ");
                    System.out.println();
                    for (int i = 0; i < array_size; i++){
                        if (array[i] == x){
                            continue;
                        }else{
                            System.out.print(array[i] + " ");
                        }
                     }}else{
                            System.out.println("Число, которое необходимо удалить из массива должно быть целым, попробуйте еще раз");
                            System.exit(0);
                        }
        in.close();
    }
}