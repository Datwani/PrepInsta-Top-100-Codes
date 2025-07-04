public class alphabet_or_not {
    public static void main(String[] args) {
        char ch='A';

        if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
            System.out.println("alphabet");
        }
        else{
            System.out.println("Not");
        }
    }
    
}
