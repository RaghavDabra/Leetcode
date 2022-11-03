class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        int a,b;
        for(int stone: stones)
            heap.add(-stone);//- stone because maxHeap

        while(heap.size() > 1){
            a= heap.poll();//stone 1
            b=heap.poll();//stone 2
            if(a !=b)//when not equal add the difference 
                heap.add(a-b);
        }
         return heap.size() != 0 ? (-heap.remove()) : 0;

    }
}