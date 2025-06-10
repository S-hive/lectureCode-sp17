public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first; 

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** 将一个项目添加到列表的前端。*/
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }    

    /**从列表中获取前端项。 */
    public int getFirst() {
        return first.item;
    }

    /** 将一个项目添加到列表的末尾。*/
    public void addLast(int x) {
        /* Your Code Here! */
        IntNode z = new IntNode(x,null);
        IntNode p = first;
        while (p.next != null){
            p = p.next;
        }
        p.next = z;
    }

    /** 使用递归返回列表中的项目数量。 */
    public int size() {
        /* Your Code Here! */
        int num = 0;
        IntNode p = first;
        while (p.next != null) {
            p = p.next;
            num += 1;
        }
        return num;
    }
}
