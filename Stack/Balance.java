import java.util.*;
public class Balance {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Stack<Character> st=new Stack<>();
        String str=in.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==']' || ch==')' || ch=='}')
            {
                if(ch==']')
                {
                while(st.peek()!='[')
                {
                    st.pop();
                    System.out.println("poped items:="+st);
                }
                st.pop();
            }
            else if(ch==')')
            {
                while( st.peek()!='('
                {
                    st.pop();
                    System.out.println("poped items:="+st);
                }
                st.pop();
            }
            else{
                while(st.peek()!='{')
                {
                    st.pop();
                    System.out.println("poped items:="+st);
                }
                st.pop();
            }
            }
            else{
                st.push(ch);
                System.out.println("pushed items:="+st);
            }
        }
        
    }
}
