package inner;
/*
 * 成员内部类
 */
public class Outer {

private String name="Hello World";
    
 class Inner{
        public void print(){
            System.out.println(name);
        }
        
        class InnerInto{
        	 public void print(){
                 System.out.println(name+"InnerInto");
             }
        }
    }
    public void print(){//定义外部类方法
        new Inner().print();//通过内部类的实例化对象调用方法
    }
    
    public static void main(String[] args) {
        //Outer outer=new Outer();
        //outer.print();//调用外部类的方法
    	 Outer.Inner.InnerInto inner=new Outer().new Inner().new InnerInto();
    	 inner.print();
        //outer.print();//调用外部类的方法
    }

}
