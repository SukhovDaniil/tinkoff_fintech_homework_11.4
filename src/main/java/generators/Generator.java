package generators;

public abstract class Generator<T> {

    protected T result;

    protected abstract void generateParams(int code);

    public final T buildResponse(final int code) {
        generateParams(code);
        return result;
    }
}
