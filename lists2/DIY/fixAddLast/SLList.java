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
    private int size;

    public SLList() {
        first = null;
        size = 0;
    }

    public SLList(int x) {
        first = new IntNode(x, null);
        size = 1;
    }

    /** 将一个项目添加到列表的前面。 */
    public void addFirst(int x) {
        first = new IntNode(x, first);
        size += 1;
    }    

    /** 从列表中检索前端项目。. */
    public int getFirst() {
        return first.item;
    }

    /** 返回列表中元素的数量。 */
    public int size() {
        return size;
    }

    /** 将一个项目添加到列表的末尾。*/
    public void addLast(int x) {
        IntNode p = first;

        /* Advance p to the end of the list. */
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /**当你对一个空的 SLList 调用 addLast 方法时会崩溃。修复这个问题。*/
    public static void main(String[] args) {
        SLList x = new SLList();
        x.addLast(5);
    }
}
