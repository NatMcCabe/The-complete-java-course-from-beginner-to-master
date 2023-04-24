public class Main {
    public static void main(String[] args) {
        int result = getResult(5);
        System.out.println(result);

        result = getResult(5, 4);
        System.out.println(result);

        result = getResult(5, "3");
        System.out.println(result);

        String strResult;
        strResult = getResult("potato", "tomato");
        System.out.println(strResult);
    }

    public static int getResult(int num){
        return num * 2;
    }

    public static int getResult(int num1, int num2){
        return num1 * num2;
    }

    public static int getResult(int num1, String value){
        return num1 * Integer.parseInt(value);
    }

    public static String getResult(String str1, String str2){
        return str1 + " " + str2;
    }
}