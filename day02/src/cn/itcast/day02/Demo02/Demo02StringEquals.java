package cn.itcast.day02.Demo02;
/*
* ==是进行对象的地址值比较的，如果确实需要对字符串的内容进行比较，可以使用两个方法。
*
*
* public boolean equals(Object obj):参数可以是任何对象，只有参数是一个字符串，并且内容相同才会给true，否则返回false
* 注意事项：
* 1.任何对象都能够使用Object接收。
* 2.equals方法具有对称性，a.equals(b)和 b.equals(a) 结果是一样的。
* 3.如果比较双方一个常量一个变量，推荐常量放在前面
*   推荐："abc".equals()        不推荐：str.equals()
*
* public boolean equalsIgnoreCase(String str): 忽略大小写来比较字符串内容
*
* */
public class Demo02StringEquals {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2));//true

        char[] charArray = {'h','e','l','l','o'};
        String str3 = new String(charArray);
        System.out.println(str3.equals(str1));//true

        System.out.println("hello".equals(str1));//true
        System.out.println(str1.equals("Hello"));//false;

        System.out.println("==================");

        String str4 = "abc";
        System.out.println("abc".equals(str4));//推荐写法：false
        System.out.println(str4.equals("abc"));//不推荐写法：字符串值为 null时会报错，空指针异常：NullPointerException

        System.out.println("=============");

        String strA = "java";
        String strB = "Java";
        System.out.println(strA.equals(strB));//false  区分大小写
        System.out.println(strA.equalsIgnoreCase(strB));//true  不区分大小写

        //注意：只有英文不区分大小写。
        System.out.println("abc一123".equalsIgnoreCase("abc壹123"));//false


    }
}
