package Kasus_1;

/*
Kelas Node merepresentasikan simpul (node) dalam pohon. Setiap objek Node memiliki atribut universe 
(universum yang direpresentasikan oleh simpul tersebut), left (referensi ke anak kiri), dan right 
(referensi ke anak kanan).
*/
class Node {
    String universe;
    Node left, right;

    public Node(String universe) {
        this.universe = universe;
        this.left = this.right = null;
    }
}
