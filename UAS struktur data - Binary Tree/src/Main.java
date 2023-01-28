public class Main {
    public static void main(String[] args) {
        TreeJava intTree = new TreeJava();

        intTree.insert(27);
        intTree.insert(58);
        intTree.insert(48);
        intTree.insert(22);
        intTree.insert(15);
        intTree.insert(97);
        intTree.insert(2);
        intTree.insert(20);
        intTree.insert(16);
        intTree.insert(17);
        intTree.insert(38);
        intTree.insert(9);

        intTree.traverseInOrder();

        System.out.println(intTree.get(26));
        System.out.println(intTree.get(22));

        System.out.println(intTree.max());
        System.out.println(intTree.min());
    }
}