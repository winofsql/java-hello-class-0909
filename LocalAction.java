public class LocalAction {

    // コンストラクタ
    public LocalAction() {
        super();
    }

    public void print( String out ) {
        Hello.printStatic( out );
    }

    public static void printStatic( String out ) {
        System.out.println( out );
    }
}
