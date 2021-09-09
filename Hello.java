/**
 * Hello
 */
public class Hello {

    public static void main(String[] args) {
        System.out.println("こんにちは");

        LocalAction la = new LocalAction();
        la.print("卒進頑張れ");

        LocalAction.printx("就職頑張れ");

        print("就活キックオフ");
    }

    private static void print( String out ) {
        System.out.println( out );
    }

    public static void print2( String out ) {
        System.out.println( out );
    }

}