package eying.leetcode;

/* Design a data structure that supports the following two operations:
 * void addWord(word)
 * bool search(word)
 * search(word) can search a literal word or a regular expression string containing only letters a-z or .. A . means it can represent any one letter.
 * For example:
 * addWord("bad")
 * addWord("dad")
 * addWord("mad")
 * search("pad") -> false
 * search("bad") -> true
 * search(".ad") -> true
 * search("b..") -> true
 * Note:
 * You may assume that all words are consist of lowercase letters a-z.
 * You should be familiar with how a Trie works. If not, please work on this problem: Implement Trie (Prefix Tree) first.
 */
//Array Implement

/**
 *  solution :
 *  1. 长度要一致
 *  2.遇到‘.’，则跳过； 其它的进行比较
 *
 *  2019年2月13日 11:04:59
 *
 *
 *  this method disadvantage:
 *  1.when search,  the efficient is very low.
 *
 *  next step:
 *  1. use the prefix tree solve the problem
 *
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AddandSearchWordDatastructuredesignEying {


    static ArrayList<String> wordArray = new ArrayList<String>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的word：");
            String word = sc.next();
            if (word.equals("2")) {
                break;
            }
            boolean addResult = addWord(word);
        }
        System.out.println("请输入你的search word：");
        String word = sc.next();
        boolean searchRes = search(word);
        System.out.println("search result:" + searchRes);
    }

    public static boolean addWord(String word) {
        wordArray.add(word);
        System.out.println("array length:" + wordArray.size() + "; and this word:" + word);
        return true;
    }

    public static boolean search(String inputWord) {
        if (inputWord.length() <= 0) {
            return false;
        }
        for (int j = 0; j <= wordArray.size(); j++) {
            String arrWord = wordArray.get(j);
            for (int k = 0; k < arrWord.length(); k++) {
                char current = inputWord.charAt(k);
                if (current == '.') continue;
                if (arrWord.charAt(k) != current) {
                    break;
                }
                if (k == arrWord.length() - 1) return true;
            }
            if (j == wordArray.size() - 1) return false;
        }

        return false;
    }
}

