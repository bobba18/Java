package com.company;

import java.util.Scanner;
/*11. Count items matching a rule
You are given an array items, where each items[i] = [typei, colori, namei] describes the type,
color, and name of the ith item. You are also given a rule represented by two strings, ruleKey
and ruleValue.
The ith item is said to match the rule if one of the following is true:
	• ruleKey == "type" and ruleValue == typei.
	• ruleKey == "color" and ruleValue == colori.
	• ruleKey == "name" and ruleValue == namei.
Return the number of items that match the given rule.
*/
public class Items {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter row of array");
        int n = in.nextInt();
        String[][] items;
        items = new String[][]{ {"computer", "blue", "pixel"},
                {"computer", "silver", "phone"},
                {"computer", "gold", "iphone"} };
            String[] property;
            property = new String[]{"type", "color", "name"};
            System.out.println("Enter rule_key");
            String rule_key = in.next();
            System.out.println("Enter rule_value");
            String rule_value = in.next();
            int count = 0;
            for (int i = 0; i < 3; i++) {
                if ((rule_key).equals(property[i])) {
                    for (int j = 0; j < 3; j++) {
                        if ((items[j][i]).equals(rule_value)) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }

