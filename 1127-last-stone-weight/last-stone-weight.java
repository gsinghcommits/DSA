
class Solution {
    public int lastStoneWeight(int[] stones) {

        // Max Heap
        PriorityQueue<Integer> heap =
            new PriorityQueue<>(Collections.reverseOrder());

        // Insert all stones
        for (int stone : stones) {
            heap.offer(stone);
        }

        // Smash the two heaviest stones
        while (heap.size() > 1) {

            int first = heap.poll();
            int second = heap.poll();

            if (first != second) {
                heap.offer(first - second);
            }
        }

        // Return remaining stone
        if (heap.isEmpty()) {
            return 0;
        }
        else {
            return heap.peek();
        }
    }
}
