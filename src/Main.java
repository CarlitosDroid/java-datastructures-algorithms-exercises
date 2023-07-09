public class Main {

    public static void main(String[] args) {

        // Heap (Complete Binary Tree) is typically represented as an array.
        //        10
        //      /    \
        //     25     23
        //    /  \    / \
        //   45  50  30  35
        //  / \  /
        // 63 65 81
        int[] heap = {10, 25, 23, 45, 50, 30, 35, 63, 65, 81};

        System.out.println(findMaximumElement(heap));
    }

    private static int findMaximumElement(int[] heap) {
        int maximumElement = heap[0];
        for (int i = 0; i < heap.length; i++) {
            maximumElement = Math.max(maximumElement, heap[i]);
        }
        return maximumElement;
    }

}
