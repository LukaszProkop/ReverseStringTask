package org.reverse.order;

import org.reverse.order.task.ReversString;

/**
 * Hello world!
 *
 */
public class App 
{
    /*
    Description:Given an input string, reverse the order of the words.
    A word is defined as a sequence of non-space characters.

    Example:
    Input: "the sky is blue" Output: "blue is sky the"
    Input: " hello world "Output: "world hello"

    corner cases:
    - one word input -> throw custom Exception
    - blank string -> another CustomException with msg:"empty"
    - Capital letters -> should stay on their position
    */
    public static void main( String[] args )
    {
        String str = "the sky is blue";
        String str2 = "the Sky is blue";
        String str3 = " hello world ";
        String str4 = " Hello World ";

        ReversString reversString = new ReversString();

        System.out.println(reversString.solution(str));
        System.out.println(reversString.solution(str2));
        System.out.println(reversString.solution(str3));
        System.out.println(reversString.solution(str4));
    }
}
