/**
 *
 * @author LOQ
 */
public class uklno4 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5};
        boolean adaDuplikat = false;

        System.out.print("Array: { ");
        for (int num : array) System.out.print(num + " ");
        System.out.println("}");

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Array memiliki elemen duplikat: " + array[i]);
                    adaDuplikat = true;
                }
            }
        }

        if (adaDuplikat) {
            System.out.println("Array tidak memiliki elemen duplikat.");
        }
    }
}
   