public class ForLoop {
    public static void main(String[] input) {
        System.out.println("hallo A");

        for (int i = 0; i < 5; i++) {
            System.out.println("hallo B" + i);
        }

        for (int j = 0; j < 5; j++)  {
            System.out.println("Ciao C" + j);
        }

        int output = add (4,5,6);

        System.out.println(output);
        int output2 = subtract(56,34);
        System.out.println(output2);
    }

    public static int add(int input1, int input2) {
        int output = input1 + input2;
        System.out.println(output);
        return output;
    }

    public static int add(int input1, int input2, int input3){

        return input1 + input2 + input3;
    }

    public static int subtract(int input1, int input2){
        int output = input1 - input2;
        System.out.println(output);
        return output;
    }
}



