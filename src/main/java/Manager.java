public class Manager {
    private Poster[] items = new Poster[0];
    private int defaultLenght = 10;

    public Manager() {

    }

    public Manager(int defaultLenght) {
        this.defaultLenght = defaultLenght;
    }

    public void add(Poster newItems) {
        Poster[] tmp = new Poster[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        tmp[tmp.length - 1] = newItems;
        this.items = tmp;
    }

    public Poster[] findAll() {
        return items;
    }

    public Poster[] findLast() {
        int resultLength;
        if (items.length >= defaultLenght) {
            resultLength = defaultLenght;
        } else {
            resultLength = items.length;
        }
        Poster[] result = new Poster[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = items[items.length - i - 1];
        }
        return result;
    }
}