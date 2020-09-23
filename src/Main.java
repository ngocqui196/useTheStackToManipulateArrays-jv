import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stacks = new Stack<>();
        Stack<Character> strings = new Stack<>();
        String mWord= "saomaykhongbaono";
        String outp = "";

        int[] arrays = {3,8,2,4,0};



        for (int i = 0;i < arrays.length;i++){
            stacks.push(arrays[i]);
        }
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = stacks.pop();
        }
        System.out.println("======Hiển thị số phần tử đảo======");
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
        }
        System.out.println();
        for (int i = 0; i < mWord.length(); i++) {
            char ch = mWord.charAt(i);
            strings.push(ch);

        }

        System.out.println("======Hiển thị chuỗi đảo======");
        for (int i = 0; i < mWord.length(); i++) {
            outp += strings.pop();
        }
        System.out.println(outp);
    }
}
