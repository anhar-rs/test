package Kasus_1;

/*
Program utama (Main) membuat objek Tree yang disebut "multiverse" dan mengisi pohon dengan beberapa simpul
yang mewakili berbagai versi atau realitas dari multiverse Marvel. Program kemudian menampilkan informasi
tentang multiverse tersebut dengan melakukan traversal pre-order, in-order, dan post-order pada pohon.
*/
public class Main {
    public static void main(String[] args) {

        Tree multiverse = new Tree();

        multiverse.root = new Node("Earth-616");
        multiverse.root.left = new Node("Earth-1610");
        multiverse.root.right = new Node("Earth-1228");
        multiverse.root.left.left = new Node("Earth-65");
        multiverse.root.left.right = new Node("Earth-199999");
        multiverse.root.right.left = new Node("Earth-295");
        multiverse.root.right.right = new Node("Earth-6311");
        multiverse.root.left.right.left = new Node("Earth-311");
        multiverse.root.left.right.right = new Node("Earth-982");
        multiverse.root.right.left.left = new Node("Earth-18119");
        multiverse.root.right.left.right = new Node("Earth-2149");
        multiverse.root.left.right.left.left = new Node("Earth-801");
        multiverse.root.right.left.left.left = new Node("Earth-1611");
        multiverse.root.right.left.right.left = new Node("Earth-807128");
        multiverse.root.right.left.right.right = new Node("Earth-5631");
        // Menampilkan informasi tentang multiverse dengan traversal pre-order,
        // in-order, dan post-order
        multiverse.displayPreOrder();
        multiverse.displayInOrder();
        multiverse.displayPostOrder();
    }
}