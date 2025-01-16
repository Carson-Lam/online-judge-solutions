/*
Author: Carson Lam
 */
import java.util.*;
public class HTMLStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        removeTag(str);
    }

    public static void removeTag(String str) {
        if (str.startsWith("<") && str.contains(">")) {
            int pos1 = str.indexOf("<");
            int pos2 = str.indexOf(">", pos1);
            String tagInner = (str.substring(1, pos2));
            String tagOne = ("<" + tagInner + ">");
            String tagTwo = ("</" + tagInner + ">");
            if (str.startsWith(tagOne) && str.endsWith(tagTwo)) {
                System.out.println(str.substring(tagOne.length(), str.length() - tagTwo.length()));
            } else {
                System.out.println(str);
            }
        }  else {
            System.out.println(str);
        }
    }
}