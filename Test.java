import java.util.*;
import java.io.*;
public class Test{
    private static char[] stack=new char[100000];
    private static int stackPoint=-1;
    public static void main(String[] args) throws Exception
    {
        System.out.println("Enter file name: ");
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String file=in.readLine();
        Scanner scan=new Scanner(new FileReader(file));
        while (scan.hasNext()){
        String stg=scan.nextLine();
        for(int k=0; k<stg.length(); k++)
        {
            if(stg.charAt(k)=='{'|| stg.charAt(k)=='(' ||stg.charAt(k)=='[')
            {
                push(stg.charAt(k));
                }
            else if(k!=stg.length()-1 && stg.charAt(k)=='/' &&stg.charAt(k+1)=='*')
            {
                push('/');
                k++;
            }
            else if(stg.charAt(k)=='}' || stg.charAt(k)==')' ||stg.charAt(k)==']')
            {
            char c=pop();
        if(c=='-')
        break;
        if(stg.charAt(k)=='}' && c!='{' || stg.charAt(k)==')'&& c!='(' || stg.charAt(k)==']' && c!='[')
        {
        push(c);
        break;
}
}
else if(k!=stg.length()-1 && stg.charAt(k)=='*' &&stg.charAt(k+1)=='/')
{
char c=pop();
if(c=='-')
break;
if(c!='/')
{
push(c);
break;
}
}
}

}
if(stackPoint==-1)
{
System.out.println("YES");
}
else
System.out.println("NO");

}

static void push(char c)
{
stackPoint++;
stack[stackPoint]=c;
}
static char pop()
{
stackPoint--;
if(stackPoint<=-2)
return '-';
return stack[stackPoint+1];
}
}