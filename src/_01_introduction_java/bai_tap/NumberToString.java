package _01_introduction_java.bai_tap;

import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short num = scanner.nextShort();
        String string = "", str = "", string1 = "", string2 = "", string3 = "";
        str = String.valueOf(num);
        switch (num) {
            case 0:
                string = "Zero";
                break;
            case 1:
                string = "One";
                break;
            case 2:
                string = "Two";
                break;
            case 3:
                string = "Three";
                break;
            case 4:
                string = "Four";
                break;
            case 5:
                string = "Five";
                break;
            case 6:
                string = "Six";
                break;
            case 7:
                string = "Seven";
                break;
            case 8:
                string = "Eight";
                break;
            case 9:
                string = "Nine";
                break;
            case 10:
                string = "Ten";
                break;
            case 11:
                string = "Eleven";
                break;
            case 12:
                string = "twelve";
                break;
        }
        if (num > 12 && num < 20) {
            switch (str.charAt(1)) {
                case '3':
                    string = "thirteen";
                    break;
                case '4':
                    string = "fourteen";
                    break;
                case '5':
                    string = "fifteen";
                    break;
                case '6':
                    string = "sixteen";
                    break;
                case '7':
                    string = "seventeen";
                    break;
                case '8':
                    string = "eighteen";
                    break;
                case '9':
                    string = "nineteen";
                    break;
            }

        }
        if (num > 19 && num < 100) {
            switch (str.charAt(0)) {
                case '2':
                    string1 = "twenty";
                    break;
                case '3':
                    string1 = "thirty";
                    break;
                case '4':
                    string1 = "forty";
                    break;
                case '5':
                    string1 = "fifty";
                    break;
                case '6':
                    string1 = "sixty";
                    break;
                case '7':
                    string1 = "seventy";
                    break;
                case '8':
                    string1 = "eighty";
                    break;
                case '9':
                    string1 = "ninety";
                    break;
            }
            switch (str.charAt(1)) {
                case '0':
                    string2 = "";
                case '1':
                    string2 = " one";
                case '2':
                    string2 = " two";
                    break;
                case '3':
                    string2 = " three";
                    break;
                case '4':
                    string2 = " four";
                    break;
                case '5':
                    string2 = " five";
                    break;
                case '6':
                    string2 = " six";
                    break;
                case '7':
                    string2 = " seven";
                    break;
                case '8':
                    string2 = " eigh";
                    break;
                case '9':
                    string2 = " nine";
                    break;
            }
        }
            if (num > 99 && num < 1000) {
                switch (str.charAt(0)) {
                    case '1':
                        string1 = "one hundred";
                        break;
                    case '2':
                        string1 = "two hundred";
                        break;
                    case '3':
                        string1 = "three hundred";
                        break;
                    case '4':
                        string1 = "four hundred";
                        break;
                    case '5':
                        string1 = "five hundred";
                        break;
                    case '6':
                        string1 = "six hundred";
                        break;
                    case '7':
                        string1 = "seven hundred";
                        break;
                    case '8':
                        string1 = "eight hundred";
                        break;
                    case '9':
                        string1 = "nine hundred";
                        break;
                }
                switch (str.charAt(1)) {
                    case '0':
                        string2 = " and";
                        break;
                    case '1':
                        switch (str.charAt(2)) {
                            case '0':
                                string2 = " and ten";
                            case '3':
                                string2 = " and thirteen";
                                break;
                            case '4':
                                string2 = " and fourteen";
                                break;
                            case '5':
                                string2 = " and fifteen";
                                break;
                            case '6':
                                string2 = " and sixteen";
                                break;
                            case '7':
                                string2 = " and seventeen";
                                break;
                            case '8':
                                string2 = " and eighteen";
                                break;
                            case '9':
                                string2 = " and nineteen";
                                break;
                        }
                        break;
                    case '2':
                        string2 = " and twenty";
                        break;
                    case '3':
                        string2 = " and thirty";
                        break;
                    case '4':
                        string2 = " and forty";
                        break;
                    case '5':
                        string2 = " and fifty";
                        break;
                    case '6':
                        string2 = " and sixty";
                        break;
                    case '7':
                        string2 = " and seventy";
                        break;
                    case '8':
                        string2 = " and eighty";
                        break;
                    case '9':
                        string2 = " and ninety";
                        break;
                }
                if (str.charAt(1) != '1') {
                    switch (str.charAt(2)) {
                        case '0':
                            string3 = "";
                            break;
                        case '1':
                            string3 = " one";
                            break;
                        case '2':
                            string3 = " two";
                            break;
                        case '3':
                            string3 = " three";
                            break;
                        case '4':
                            string3 = " four";
                            break;
                        case '5':
                            string3 = " five";
                            break;
                        case '6':
                            string3 = " six";
                            break;
                        case '7':
                            string3 = " seven";
                            break;
                        case '8':
                            string3 = " eight";
                            break;
                        case '9':
                            string3 = " nine";
                            break;
                    }
                }

            }



        string += string1 + string2 + string3;
        System.out.println(string);

    }
}
