import java.util.*;
public class Duplicate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        Stack<Character> stc=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch!=')')
            {
                stc.push(ch);

            }
            else
            {
                if(stc.peek()=='(')
                {
                    System.out.println("true");
                    return;

                }
                else{
                    while(stc.peek()!='(')
                    {
                    stc.pop();
                }
                stc.pop();
            }

            }
            }
            System.out.println("false");
        }
        
    }
    

