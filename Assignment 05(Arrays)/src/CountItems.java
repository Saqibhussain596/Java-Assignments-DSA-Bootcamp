// You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
//
//The ith item is said to match the rule if one of the following is true:
//
//ruleKey == "type" and ruleValue == typei.
//ruleKey == "color" and ruleValue == colori.
//ruleKey == "name" and ruleValue == namei.
//Return the number of items that match the given rule
import java.util.Scanner;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Objects;

public class CountItems {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<String>> items = new ArrayList<>();
        for (int count = 0; count < 3; count++){
            items.add(new ArrayList<>());
        }
        for (int outer_count = 0; outer_count < 3; outer_count++)
        {
            for (int inner_count = 0; inner_count < 3; inner_count++)
            {
                items.get(outer_count).add(in.next());
            }
        }
        String ruleKey;
        String ruleValue;
        System.out.print("Enter value of ruleKey : ");
        ruleKey = in.next();
        System.out.print("Enter value of ruleValue : ");
        ruleValue = in.next();

        int count = 0, item_attr;
        if (ruleKey.equals("type"))
            item_attr = 0;
        else if (ruleKey.equals("color"))
            item_attr = 1;
        else
            item_attr = 2;
        for (ArrayList<String> item : items) {

            if (Objects.equals(item.get(item_attr), ruleValue))
                count++;
        }
        System.out.println("Number of items that match the given rule are : " + count);
    }
}
