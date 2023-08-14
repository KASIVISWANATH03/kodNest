
class HelloWorld {
    public static void main(String[] args) {
        String str = "hello world";
        char arr[] = new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            boolean f = true;
            for(int j=0;j<arr.length;j++)
            {
                if(str.charAt(i)==arr[j])
                {
                    f = false;
                }
            }
            if(f)
            {
                arr[i] = str.charAt(i);
            }
            else
            {
                arr[i] = '0';
            }
            
        }
        for(char x: arr)
        {
            if(x=='0')
            {
                continue;
            }
            else
            {
                int c = 0;
                for(int k=0;k<str.length();k++)
                {
                    if(x == str.charAt(k))
                    {
                        c++;
                    }
                }
                System.out.println(x+": "+c);
            }
        }
        }
}
