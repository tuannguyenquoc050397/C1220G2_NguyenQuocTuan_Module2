package test;

public class X {
    public static void main(String [] args) {
        try {
            return;
        }
        finally{
            System.out.println( "Finally" );
        }
    }
}