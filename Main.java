public class Main {
    public static void main (String[] args) {
        System.out.println("Hello World!!!");
        int toEven = 45;
        sampleMethodIsEven(toEven);
    }

    static void sampleMethodIsEven(int num) {
        String[] arr = {"even", "odd"};
        System.out.println(arr[num%2]);
    }

}
