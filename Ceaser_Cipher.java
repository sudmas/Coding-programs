package pkgEncryption;
import pkgEncryption.pkgTransformation.Transform;
import java.util.Scanner;

public class TestEncryption implements Transform{
    String st ="";
    public void encrypt(String input)
    {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            char s;
            s = (char)(ch+3);
            if(s>'Z'||s>'z')    
            {
                s=(char)(input.charAt(j)-(26-3));
                st+=s;
            }
            else
                st+=s;
        }
        System.out.println("Encrypted text is : "+st); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String str = sc.nextLine();
        TestEncryption obj = new TestEncryption();

        obj.encrypt(str);
    }
}