public class ShortWordFilter implements Filter {
    @Override
    public boolean accept(Object x) {
        return x instanceof String && ((String) x).length() < 5;
    }
}
