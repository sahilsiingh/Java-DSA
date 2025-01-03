public class Trie {
    private TrieNode root;

    // Constructor
    public Trie() {
        root = new TrieNode();
    }

    // Method to insert a word into the Trie
    public void insert(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a'; // Calculate index (0 for 'a', 1 for 'b', etc.)

            if (current.children[index] == null) {
                current.children[index] = new TrieNode(); // Create new TrieNode if it's null
            }

            current = current.children[index]; // Move to the next node
        }

        current.isEndOfWord = true; // Mark the end of the word
    }

    // Method to search for a word in the Trie
    public boolean search(String word) {
        TrieNode current = root;

        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';

            if (current.children[index] == null) {
                return false; // If the character does not exist, return false
            }

            current = current.children[index]; // Move to the next node
        }

        return current.isEndOfWord; // Check if the word ends here
    }

    // Method to check if there's any word in the Trie that starts with the given prefix
    public boolean startsWith(String prefix) {
        TrieNode current = root;

        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';

            if (current.children[index] == null) {
                return false; // If the prefix does not exist, return false
            }

            current = current.children[index];
        }

        return true; // If we successfully traverse the prefix
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        // Insert words into the trie
        trie.insert("apple");
        trie.insert("app");
        trie.insert("banana");

        // Search for words
        System.out.println(trie.search("apple"));  // true
        System.out.println(trie.search("app"));    // true
        System.out.println(trie.search("appl"));   // false
        System.out.println(trie.search("banana")); // true
        System.out.println(trie.search("bananas")); // false

        // Check for words starting with a prefix
        System.out.println(trie.startsWith("ban")); // true
        System.out.println(trie.startsWith("bat")); // false
    }
}
