package dataStructure;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int maxsize;

    public MaxHeap(int maxSize){
        this.maxsize = maxsize;
        this.size = 0;
        heap = new int[this.maxsize + 1];
        heap[0] = Integer.MAX_VALUE;
    }

    private int parent(int pos){
        return pos / 2;
    }

    private int leftChild(int pos){
        return (2 * pos);
    }

    private int rightChild(int pos){
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos){
        return pos >= (size / 2) && pos <= size;
    }

    private void swap(int fpos, int spos){
        int tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }

    public void insert(int element){
        if(size >= maxsize){
            return;
        }
        heap[++size] = element;
        int current = size;

        while(heap[current] > heap[parent(current)]){
            swap(current, parent(current));
            current= parent(current);
        }
    }

    public void print(){
        for(int i=1; i<=size / 2; i++){
            System.out.print(" Parent : " + heap[i] + " Left child : " +
                heap[2 * i] + " right child : " + heap[2 * i + 1]);
        }
    }

    public int extractMax(){
        int popped = heap[1];
        heap[1] = heap[size--];
        maxHeapify(1);
        return popped;
    }

    private void maxHeapify(int pos){
        if(isLeaf(pos)){
            return;
        }

        if(heap[pos] < heap[leftChild(pos)] || heap[pos] < heap[rightChild(pos)]){
            if(heap[leftChild(pos)] > heap[rightChild(pos)]){
                swap(pos, leftChild(pos));
                maxHeapify(leftChild(pos));
            }else{
                swap(pos, rightChild(pos));
                maxHeapify(rightChild(pos));
            }
        }
    }

}
