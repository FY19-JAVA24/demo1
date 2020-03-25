package inner;
/*
 * 静态内部
 */
public class Company {

	String companyNam;
    static String country;
    protected  static class Clear{
        String name;
        public Clear() {
            // TODO Auto-generated constructor stub
        }
        
        public Clear(String name) {
            super();
            this.name = name;
        }

        public void work(String name){
            String na=new Company().companyNam="联想";
            country="中国";
            System.out.println(name+"为"+na+"打扫卫生，该公司属于"+country);
        }
    }
    public static void main(String[] args) {
        Company.Clear zcl=new Company.Clear();
        zcl.work("shen_hua");
    }
}
