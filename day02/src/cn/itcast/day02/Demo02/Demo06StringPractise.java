package cn.itcast.day02.Demo02;
/*给一个数组，然后按照指定格式打印出数组中的元素
      格式：[world1#world2#world3]
* 思路：1.获取数组中的每一个元素  for循环
       2.写一个方法，要获取数组中的每一个元素，然后用一个字符串拼接起来。最后返回该字符串
         三要素：
         返回值 String
         名字 fromArrayToString()
         参数  int[] array

*
*
*
*
* */
public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};

        String str1 = fromArrayToString(array);
        System.out.println(str1);

    }

    public static String fromArrayToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                str +="world"+array[i]+"]";
            }else {
                str +="world"+array[i]+"#";
            }
        }
        return str;
    }

//    public static String fromArrayToString(int[] array){
//        String str = "[";
//        for (int i = 0; i < array.length; i++) {
//            if (i==array.length-1){
//                str+="world"+array[i]+"]";
//            }else{
//                str+="world"+array[i]+"#";
//            }
//        }
//
//        return str;
//    }
}
