import java.util.Scanner;
public static void main(String[] args) {
    int arr[] = {1,2,3,4,5};

    System.out.println("Digite un Id para busqueda: ");
    Scanner input = new Scanner (System.in);
    int num = input.nextInt();
    int result = BinarySearchIterative(arr,num);

    if(result!=-1)
        System.out.println("Valor encontrado " + result);
    else
        System.out.println("Valor no encontrado ");
}
class BinarySearchIterative(int{} arr,int num){
    int start=0;
    int end=arr.length;
    for(int i=0;i<end){
        if{
            start = n;
        }
        else {
            end=n;
        }
    }
}
