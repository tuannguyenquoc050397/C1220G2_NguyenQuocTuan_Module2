package _01_introduction_java.bai_tap;

import java.util.Scanner;

public class NumToStr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number: ");
        short num = scanner.nextShort();
        String str="",string1="",string2="", string3="", string="";
        str = String.valueOf(num);
        String reverseStr="";
        for(byte i=0; i<str.length(); i++){
                reverseStr+=str.charAt(str.length()-1-i);
        }
        if(str.length()==2){
            reverseStr+="a";
        }else if(str.length()==1){
            reverseStr+="aa";
        }
        if(num>9&&num<20){
            switch (num){
                case 10:
                    string = "Ten";
                    break;
                case 11:
                    string = "Eleven";
                    break;
                case 12:
                    string = "twelve";
                    break;
                case 13:
                    string = "thirteen";
                    break;
                case 14:
                    string = "fourteen";
                    break;
                case 15:
                    string = "fifteen";
                    break;
                case 16:
                    string = "sixteen";
                    break;
                case 17:
                    string = "seventeen";
                    break;
                case 18:
                    string = "eighteen";
                    break;
                case 19:
                    string = "nineteen";
                    break;
            }
        }else{
        switch (reverseStr.charAt(0)) {
            case '0':
                if(str.length()==2){
                    string1="";
                }else {
                    string1 = "Zero";
                }
                break;
            case '1':
                string1 = " One";
                break;
            case '2':
                string1 = " Two";
                break;
            case '3':
                string1 = " Three";
                break;
            case '4':
                string1 = " Four";
                break;
            case '5':
                string1 = " Five";
                break;
            case '6':
                string1 = " Six";
                break;
            case '7':
                string1 = " Seven";
                break;
            case '8':
                string1 = " Eight";
                break;
            case '9':
                string1 = " Nine";
                break;
        }

        switch (reverseStr.charAt(1)) {
            case '0':
                string2="";
                break;
            case '1':
                switch (reverseStr.charAt(0)){
                    case '0':
                        string2 = "Ten";
                        break;
                    case '1':
                        string2 = "Eleven";
                        break;
                    case '2':
                        string2 = "twelve";
                        break;
                    case '3':
                        string2 = "thirteen";
                        break;
                    case '4':
                        string2 = "fourteen";
                        break;
                    case '5':
                        string2 = "fifteen";
                        break;
                    case '6':
                        string2 = "sixteen";
                        break;
                    case '7':
                        string2 = "seventeen";
                        break;
                    case '8':
                        string2 = "eighteen";
                        break;
                    case '9':
                        string2 = "nineteen";
                        break;
                }
                string1="";
                break;
            case '2':
                string2 = "twenty";
                break;
            case '3':
                string2 = "thirty";
                break;
            case '4':
                string2 = "forty";
                break;
            case '5':
                string2 = "fifty";
                break;
            case '6':
                string2 = "sixty";
                break;
            case '7':
                string2 = "seventy";
                break;
            case '8':
                string2 = "eighty";
                break;
            case '9':
                string2 = "ninety";
                break;
            default:
                string2="";
        }
        switch (reverseStr.charAt(2)) {
            case '1':
                string3 = "one hundred and ";
                break;
            case '2':
                string3 = "two hundred and ";
                break;
            case '3':
                string3 = "three hundred and ";
                break;
            case '4':
                string3 = "four hundred and ";
                break;
            case '5':
                string3 = "five hundred and ";
                break;
            case '6':
                string3 = "six hundred and ";
                break;
            case '7':
                string3 = "seven hundred and ";
                break;
            case '8':
                string3 = "eight hundred and ";
                break;
            case '9':
                string3 = "nine hundred and ";
                break;
            default:
                string3="";
        }
    }
        string+=string3+string2+string1;
        System.out.println(string);
    }
}
