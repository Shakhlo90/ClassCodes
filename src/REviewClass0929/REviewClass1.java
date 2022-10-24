package REviewClass0929;

import java.util.Arrays;
import java.util.Locale;

public class REviewClass1 {
    public static void main(String[] args) {
       /* Append Value "Hello" to it

Append value "World" to it.

Print in UPPERCASE.

**Expected Output:**

```
HELLO WORLD
```*/ StringBuffer sb=new StringBuffer();
 sb.append("Hello ");
sb.append("World");

String str=sb.toString().toUpperCase();

        System.out.println(str);

        System.out.println("----------------------------------");
        String st="Hello";
        char []c=st.toCharArray();
        String tt="";
        for(int i = c.length-1;i>=0; i-- ){
            tt=tt+=c[i];

        }
        System.out.println(tt);

    }
}
