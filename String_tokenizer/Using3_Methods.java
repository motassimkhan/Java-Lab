package String_tokenizer;
import java.util.StringTokenizer;
public class Using3_Methods {
    public static void main(String[] args) {   
        StringTokenizer st = new StringTokenizer("My name is name ");
        StringTokenizer st1 = new StringTokenizer("i like code ");
        System.out.println(st1.countTokens()+"\n");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
