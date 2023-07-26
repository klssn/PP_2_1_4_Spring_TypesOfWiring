package koschei.models;

public class Island2 {

    private Tree3 tree;

    public Island2(Tree3 tree) {
        this.tree = tree;
    }

    @Override
    public String toString() {
        return ", на острове дерево " + tree.toString();
    }
}
