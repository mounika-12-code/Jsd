package operaters;

public class Construct {
	 static  int age;
	static  String name;
	

	public Construct(int i) {
		// TODO Auto-generated constructor stub
		this.age=i;
	}


	public Construct() {
		// TODO Auto-generated constructor stub
		System.out.print("constructer involed");
	}
	public Construct(String data)
	{ this.name=data;
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Construct ob1=new Construct();
          Construct ob2=new Construct(24);
          Construct ob3=new Construct("mounika");
          System.out.println(age);
          System.out.println(name);
      
          
	}

}
