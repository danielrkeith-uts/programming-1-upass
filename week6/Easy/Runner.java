public class Runner {

    public static void main(String[] args) {
        IntWrapper iw = new IntWrapper(3);
        System.out.println(iw.getValue());

        iw.setValue(5);
        System.out.println(iw.getValue());

        iw.doubleValue();
        System.out.println(iw.getValue());
    }
    
}
