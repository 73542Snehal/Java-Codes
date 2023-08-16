package skillTestJava;
/*Code Breaker
Jack Ryan is one of the world’s most famous cryptographers. He has been recently tasked with breaking a code with which our country’s enemies are communicating. He has thought of a possible break in the code, using a very complex system of strings, which thankfully, you have nothing to do with. You are tasked with a little problem. Jack will give you n strings, labelled S1, S2, …. Sn, along with q queries.
In each query, you have an integer X and a string CODE. You will take into consideration strings S1 to SX. Among these selected strings, consider all the strings such that their longest common prefix with CODE is the maximum possible. Now, from these strings, print the lexicographically smallest one. This would give Jack tremendous insight into further breaking the code. Can you help him?
Input Format:
The first line of the input contains a single integer N.
N lines follow. For each valid i, the i-th of these lines contains Chef's string Si.
The next line contains a single integer Q.
The following Q lines describe queries. Each of these lines contains an interger R, followed by a space and a string P
Constraints:
1 ≤ n ≤ 100,000 
1 ≤ |Si| ≤ 10 for each valid i
1 ≤ q ≤ 100,000
1 ≤ X ≤ n
1 ≤ |CODE| ≤ 10
Output Format:
For each query, print a single line containing the string that satisfies the required conditions — the answer to that query.
Sample Input 1:
4
abcd
abce
abcdex
abcde
3
3 abcy
3 abcde
4 abcde
Sample Output 1:
abcd
abcdex
abcde*/
public class CodeBreaker {

}
/*import java.util.Scanner;

class Node {
    Node[] links = new Node[26];
    int[] arr = new int[26];
    boolean flag = false;
    int flag_track = 0;

    Node moveNext(char ch) {
        return links[ch - 'a'];
    }

    boolean contains(char ch) {
        return links[ch - 'a'] != null;
    }

    boolean valid(char ch, int mx) {
        return arr[ch - 'a'] <= mx;
    }
}

class Trie {
    private Node root;

    Trie() {
        root = new Node();
    }

    void insert(String s, int track) {
        Node t = root;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (!t.contains(ch)) {
                t.links[ch - 'a'] = new Node();
                t.arr[ch - 'a'] = track;
            }
            t = t.moveNext(ch);
        }
        if (!t.flag) {
            t.flag = true;
            t.flag_track = track;
        }
    }

    void buildAns(String s, int mx, StringBuilder tmp) {
        Node t = root;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (t.contains(ch) && t.valid(ch, mx)) {
                tmp.append(ch);
                t = t.moveNext(ch);
            } else {
                break;
            }
        }

        char ch;
        while (true) {
            if (t.flag && t.flag_track <= mx) {
                return;
            }

            for (ch = 'a'; ch <= 'z'; ch++) {
                if (t.contains(ch) && t.valid(ch, mx)) {
                    tmp.append(ch);
                    t = t.moveNext(ch);
                    break;
                }
            }
            ch--;

            if (ch == 'z') {
                return;
            }
        }
    }
}

public class Solution {
    public static void main(String[] args) {
        Trie trie = new Trie();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            String s = scanner.next();
            trie.insert(s, i);
        }

        int q = scanner.nextInt();
        while (q-- > 0) {
            int mx = scanner.nextInt();
            String s = scanner.next();
            StringBuilder tmp = new StringBuilder();
            trie.buildAns(s, mx, tmp);
            System.out.println(tmp);
        }
    }
}

*/