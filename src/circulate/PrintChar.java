package circulate;

public class PrintChar {
    public static void main(String[] args) {
        char[] s;
        s = new char[26];

        for(int i = 0; i <26;i++){
            s[i] = (char)('A' + i);
            System.out.println(s[i]);
        }
    }
}
