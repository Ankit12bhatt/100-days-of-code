import java.util.*;
public class Basic {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        System.out.println(st);
        st.push(30);
        st.push(50);
        st.push(60);
        System.out.println(st);
        System.out.println(st.peek()+" "+ st.size());
        st.pop();
        System.out.println(st.peek()+" "+st.size());
        System.out.println(st);
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        st.pop();
        System.out.println(st);

    }
    
}
