package implementation;

public class ArrayList {

    public static final int SIZE_FACTOR = 5;
    private Object[] data;
    private int size;
    private int index;

    public ArrayList() {
        data = new Object[SIZE_FACTOR];
        size = SIZE_FACTOR;
        index = 0;
    }

    public void add(Object obj) {
        if (this.index == this.size -1) ensureCapacity();
        this.data[this.index] = obj;
        this.index++;
    }

    private void ensureCapacity() {
        this.size = this.size + SIZE_FACTOR;
        Object[] temp = new Object[this.size];
        for(int i = 0; i < this.data.length; i++) {
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    public Object get(int i) throws Exception {
        if (i > this.index - 1) throw new Exception("ArrayIndexOutOfBound");
        if (i < 0) throw new Exception("Negative index provided");
        return this.data[i];
    }

    public boolean remove(int i) throws Exception {
        if (i > this.index - 1) throw new Exception("ArrayIndexOutOfBound");
        if (i < 0) throw new Exception("Negative index provided");
        for(int x = i; x < this.data.length - 1; x++) {
            this.data[x] = this.data[x + 1];
        }
        this.index--;
        return true;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < this.index; i++) {
            result += this.data[i] + " ";
        }
        return result;
    }
}




