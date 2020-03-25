package inner;
/*
 * 局部内部类
 */
public class Outer2 {

    public int a = 1;
    private int b = 2;
    public void method( final int c) {
        int d = 3;
        final int e = 2;
         class Inner {
            private void iMethod( int e) {
                System.out.println("e="+e);
            }
        }
        new Inner().iMethod(e);
    }
    public static void main(String[] args) {
    	Outer2 out2=new Outer2();
        
    	out2.method(5);
    }

}
