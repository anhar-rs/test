package Kasus_1;

/*
Kelas Tree merepresentasikan struktur pohon dengan simpul root. Setiap objek Tree memiliki atribut root 
yang merupakan simpul pertama dalam pohon. Konstruktor Tree digunakan untuk inisialisasi pohon dengan 
menetapkan root ke nilai null jika pohon belum berisi simpul.
*/
class Tree {
    Node root;

    public Tree() {
        this.root = null;
    }

    /*
     * Metode preOrderTraversal digunakan untuk melakukan traversal pre-order pada
     * pohon. Metode ini menerima
     * parameter node (simpul saat ini) dan mencetak informasi tentang simpul dan
     * anak-anaknya. Jika simpul memiliki
     * anak kiri atau kanan, informasi anak-anak akan dicetak dengan dipisahkan oleh
     * koma. Jika simpul tidak memiliki
     * anak, akan dicetak tanda strip (-). Metode ini kemudian melakukan rekursi
     * pada anak kiri dan anak kanan dari simpul.
     */
    private void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.universe + ": ");
            if (node.left != null || node.right != null) {
                if (node.left != null) {
                    System.out.print(node.left.universe);
                }
                if (node.right != null) {
                    if (node.left != null) {
                        System.out.print(", ");
                    }
                    System.out.print(node.right.universe);
                }
            } else {
                System.out.print("-");
            }
            System.out.println();

            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    /*
     * Metode displayPreOrder digunakan untuk menampilkan semua simpul dalam pohon
     * secara pre-order.
     * Metode ini mencetak "All Universe (Pre-Order):", melakukan traversal
     * pre-order pada pohon,
     * dan mencetak hasil traversal.
     */
    public void displayPreOrder() {
        System.out.println("All Universe (Pre-Order):");
        preOrderTraversal(root);
        System.err.println();
    }

    /*
     * Metode inOrderTraversal digunakan untuk melakukan traversal in-order pada
     * pohon. Metode ini menerima parameter
     * node (simpul saat ini) dan melakukan rekursi pada anak kiri, mencetak
     * informasi tentang simpul, dan melakukan
     * rekursi pada anak kanan. Informasi tentang simpul dan anak-anaknya akan
     * dicetak, dengan tanda koma digunakan untuk
     * memisahkan anak kiri dan kanan. Jika simpul tidak memiliki anak, akan dicetak
     * tanda strip (-). Metode ini mencetak
     * informasi pada setiap simpul dan pindah ke baris berikutnya setelah memproses
     * simpul saat ini.
     */
    private void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.universe + ": ");
            if (node.left != null) {
                System.out.print(node.left.universe);
            }
            if (node.left != null && node.right != null) {
                System.out.print(", ");
            }
            if (node.right != null) {
                System.out.print(node.right.universe);
            }
            if (node.left == null && node.right == null) {
                System.out.print("-");
            }
            System.out.println(); // Move to the next line after processing the current node

            inOrderTraversal(node.right);
        }
    }

    /*
     * Metode displayInOrder digunakan untuk menampilkan semua simpul dalam pohon
     * secara in-order.
     * Metode ini mencetak "All Universe (In-Order):", melakukan traversal in-order
     * pada pohon,
     * dan mencetak hasil traversal.
     */
    public void displayInOrder() {
        System.out.println("All Universe (In-Order):");
        inOrderTraversal(root);
        System.out.println();
    }

    /*
     * Metode postOrderTraversal digunakan untuk melakukan traversal post-order pada
     * pohon.
     * Metode ini menerima parameter node (simpul saat ini) dan melakukan rekursi
     * pada anak kiri,
     * anak kanan, dan akhirnya mencetak informasi tentang simpul dan anak-anaknya.
     * Informasi tentang
     * simpul dan anak-anaknya akan dicetak, dengan tanda koma digunakan untuk
     * memisahkan anak kiri dan kanan.
     * Jika simpul tidak memiliki anak, akan dicetak tanda strip (-). Metode ini
     * mencetak informasi pada
     * setiap simpul dan pindah ke baris berikutnya setelah memproses simpul saat
     * ini.
     */
    private void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);

            System.out.print(node.universe + ": ");

            if (node.left != null) {
                System.out.print(node.left.universe);
            }

            if (node.left != null && node.right != null) {
                System.out.print(", ");
            }

            if (node.right != null) {
                System.out.print(node.right.universe);
            }

            if (node.left == null && node.right == null) {
                System.out.print("-");
            }

            System.out.println(); // Move to the next line after processing the current node
        }
    }

    /*
     * Metode displayPostOrder digunakan untuk menampilkan semua simpul dalam pohon
     * secara post-order.
     * Metode ini mencetak "All Universe (Post-Order):", melakukan traversal
     * post-order pada pohon,
     * dan mencetak hasil traversal.
     */
    public void displayPostOrder() {
        System.out.println("All Universe (Post-Order):");
        postOrderTraversal(root);
        System.out.println();
    }
}