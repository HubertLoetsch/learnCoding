public class AufgabeCäsarverschlüsselung {
    public static void main(String[] args) {

        String s = "Code";
        int offset = 3;

        System.out.println(encryptString(s, offset));

    }

    public static String encryptString(String s, int offset) {
        String ret = "";
        for(int i = 0; i < s.length(); i++) {
            ret += encrypt(s.charAt(i), offset);
            System.out.println(ret);
        }
        return ret;
    }

    public static char encrypt(char c, int offset)
    {
        if((int)c+offset > 122) {
            return (char)((int)c+offset-26);
        }
        else {
            return (char)((int)c+offset);
        }
    }
}
