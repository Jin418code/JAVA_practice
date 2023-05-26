package GenericSample;

public class Generic2<T> {
    private T[] i;
    private int index;
    public Generic2(int i) {
        this.i = (T[]) new Object[i];
    }
    //(Type)...args : 매개변수 갯수 상관없이 여러개 입력할 수 있다는 연산자
    public void Data(T...args) {
        for (T arg : args) {
            i[index++] = arg;
        }
    }
    
    public void addIntData() {
        int sum = 0;
        for (T arg : i) {
            sum += (int)arg;
        }
        System.out.println(sum);
        System.out.println(sum/i.length);
    }

    public void addDoubleData() {
        double sum = 0;
        for (T arg : i) {
            sum += (double)arg;
        }
        System.out.println(sum);
        System.out.println(sum/i.length);
    }
    
    public void printData() {
        for (T t : i) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}