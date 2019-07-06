/*使用下面方法头编写一个方法，返回一个排好序的字符串。
public static String sort (String s)
例如，sort("abc")返回abc。编写一个测试程序，提示用户输入一个字符串，显示排好序的字符串。
 */

package com.yang;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.print("Enter a string: ");
	String str = input.nextLine();
	System.out.print("The sorted string is: "+ sort(str)+"\n");
    }

    public static String sort(String s) {
        String result = "";//初始化一个字符串

        char[] s_char = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            s_char[i] = s.charAt(i);
        }//用输入的字符串生成一个字符型数组，便于排序

        //排序：
        for (int i = 0; i < s_char.length - 1; i++) {
            char currentMin = s_char[i];
            //在这里，s_char[i]这个字符可以看成是数值为ascii十进制码的整数
            int currentMinIndex = i;
            for (int j = i + 1; j< s_char.length; j++) {
                if (currentMin > s_char[j]) {
                    currentMin = s_char[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                s_char[currentMinIndex] = s_char[i];
                s_char[i] = currentMin;
            }
        }
        //生成一个排好序的字符串：
        for (int i = 0; i < s_char.length; i++) {
            result = result + s_char[i];
        }
        return result;
    }

}
