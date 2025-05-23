package JavaBasics.StringsInJAva.src;

import java.util.*;
public class CharacterHashing {
    public static void main(String[] args) {
        String str="abdefaabbcfgzmnopqurstuvw";
       // char[] charArray=new char[26];
        int[] arr=new int[26];
        for(char ch:str.toCharArray()){
                //charArray[ch-'a']=ch;
                arr[ch-'a']+=1;
        }
    //    ' 'for(int c:arr){
    //         System.out.print(c+" ");
    //     }''
        for(char ch=97;ch<=122;ch++){
                 System.out.println(ch+" "+arr[ch-'a']);
        }
        char[] chArray=new char[26];
        for(char ch=97;ch<=122;ch++){
        chArray[ch-'a']=ch;
        System.out.print(ch-'a'+" "+chArray[ch-'a']+" ");
        }

        
    }
}


