import java.util.Scanner;

public class SpeciasequencesAG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str= scanner.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'){
                for(int j=i;j<str.length();j++){
                    if(str.charAt(j)=='G'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
