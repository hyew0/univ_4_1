package w04.task260324.baseArray;

class BinaryArray extends BaseArray {
    private int threshold;

    public BinaryArray(int size, int threshold) {
        super(size);
        this.threshold = threshold;
    }

    // 오버라이딩: 임계값보다 크면 1, 아니면 0 삽입
    @Override
    public void add(int n) {
        if (n > threshold) {
            super.add(1);
        } else {
            super.add(0);
        }
    }
}
