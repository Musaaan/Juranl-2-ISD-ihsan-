// Kelas Node untuk menampung data  
class Node { 
    char data; 
    Node left, right; 
 
    public Node(char item) { 
        data = item; 
        left = right = null; 
    } 
} 
 
// Kelas BST 
class BinarySearchTree { 
    Node root; 
 
    BinarySearchTree() { 
        root = null; 
    } 
 
    // Method pembungkus yang memanggil method insertRec *mengapa dibungkus supaya root bisa dipakai kedalam method 
    void insert(char data) { 
        root = insertRec(root, data); 
    } 
 
    // Method yang berfungsi untuk melakukan penyisipan kedalam tree dengan menggunakan teknik rekursif 

    Node insertRec(Node root, char data) { 
        if (root == null) { 
            root = new Node(data); 
            return root; 
        } 
 
        if (data < root.data) { 
            root.left = insertRec(root.left, data); 
        } else if (data > root.data) { 
            root.right = insertRec(root.right, data); 
        } 
 
        return root; 
    } 
 
   // Methodnya hanya sebagai pembungkus saja, yang memanggil method searchRec 
    boolean search(char data) { 
        return searchRec(root, data); 
    } 
 
   // Method yang berfunsi mencari node dengan memnggunakan teknik rekursif sampai node yang dicari ditemukan
 
    boolean searchRec(Node root, char data) { 
        if (root == null) { 
            return false; 
        } 
 
        if (root.data == data) { 
            return true; 
        } 
 
        if (root.data > data) { 
            return searchRec(root.left, data); 
        } 
 
        return searchRec(root.right, data); 
    } 
 
    // Method bernama inorder yang memanggil method inorderRec  
    void inorder() { 
        inorderRec(root); 
    } 
 
   // Method yang berfungsi melakukan traversal inorder terhadap root 
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.print(root.data + " "); 
            inorderRec(root.right); 
        } 
    } 
} 
 
 
public class Main { 
    public static void main(String[] args) { 
        BinarySearchTree bst = new BinarySearchTree(); 
 
        // Memasukan huruf-huruf 
        char[] data = {'F', 'E', 'H', 'D', 'G', 'C', 'B', 'H', 'K', 'J'}; 
        for (char datum : data) { 
            bst.insert(datum); 
        } 
 
        // Menampilkan hasil traversal in-order  
        System.out.print("Hasil traversal in-order di dalam tree :  "); 
        bst.inorder(); 
        System.out.println(); 
 
        // Kode bagian ini berfungsi untuk memanggil method search dari kelas BST lalu menampilkannya 

        char[] searchChars = {'K', 'A'}; 
        for (char ch : searchChars) { 
            boolean result = bst.search(ch); 
            System.out.println("Huruf " + ch + (result ? " ditemukan" : " tidak ditemukan") + " di dalam tree"); 
        } 
    } 
}