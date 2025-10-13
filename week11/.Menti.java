public class Wrapper<T> {
    private final T value;

    public Wrapper(T value) {
        this.value = value;
    }

    ... getValue() {
        return value;
    }
}


