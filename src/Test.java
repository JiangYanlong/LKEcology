import ln.LN;
import weaver.formmode.webservices.ModeDataServiceImpl;
import weaver.formmode.webservices.ModeDateService;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		ModeDateService service = new ModeDataServiceImpl();
		LN ln = new LN();
		ln.CkHrmnum();
	}

}
