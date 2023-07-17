package sem1;

public class Task01 {
    public static int arrayLength(Integer[] array, int num) {
        if (array == null) return -3;
        if (array.length < 10) return -1;
        for (int i = 0; i < array.length; i++){
            if (array[i] == num){
                return i;
            }
        }
        return -2;
    }
    public static void main(String[] args) {
        Integer[] array = new Integer[12];
        for (int i = 0; i < array.length; i++) array[i] = i;
        System.out.println(arrayLength(null, 77));
    }
}