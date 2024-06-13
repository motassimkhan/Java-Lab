package String_tokenizer;
import java.util.StringTokenizer;
public class Example {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My name is name frfr");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
