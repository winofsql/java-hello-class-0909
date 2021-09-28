import database.MysqlAction;

public class Hello {

    public static void main(String[] args) {

        LocalAction la = new LocalAction();
        la.print("LocalAction インスタンス => Hello public static");

        LocalAction.printStatic("LocalAction static");

        Hello.printlocalStatic("Hello static( private )");

        MysqlAction ma = new MysqlAction();
        ma.loadMySQL();
    }

    private static void printlocalStatic( String out ) {
        System.out.println( out );
    }

    public static void printStatic( String out ) {
        System.out.println( out );
    }

}