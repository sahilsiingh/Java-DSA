public class trieInsert {

    static class node {
        node[] children;
        boolean eow;

        public node() {
            children = new node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static node root = new node();

    public static void insert(String word) {
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (root.children[idx] == null) {
                root.children[idx] = new node();
            }
            if (i == word.length() - 1) {
                root.children[idx].eow = true;
            }
            root = root.children[idx];
        }
    }

    public static void main(String[] args) {
        String words[] = { "the", "a", "there", "their", "any", "ant" };
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
    }
}
