class publisher{
	String publisher;
	publisher (String publi){
		this.publisher=publi;
	}
}


class Book{
	String name;
	publisher publisher;
	Book (){}
	public Book(String name , publisher publisher) {
		this.name=name;
		this.publisher=publisher;
	}
	
}

class Literature extends Book{
	String Lit_type = "Liteature";
	Literature(String name , publisher publisher){
		super(name, publisher);}
	void display() {
		System.out.println("Name:"+super.name);
		System.out.println("Type:"+this.Lit_type);
		System.out.println("publisher:"+this.publisher.publisher);
	}
}
	
class Fiction extends Book{
		String Lit_type = "Fiction";
		Fiction( String name , publisher publisher){
				super(name , publisher);}
		
		void display() {
			System.out.println("Name:"+super.name);
			System.out.println("Type:"+this.Lit_type);
			System.out.println("publisher:"+this.publisher.publisher);
		}
}

public class InheritanceBook {

	public static void main(String[] args) {
		publisher lp = new publisher("s.chand");
		Literature l = new Literature("As you like it",lp);
		l.display();
		publisher fp = new publisher("Tata McGraw Hill");
		Fiction f = new Fiction("Tempest",fp);
		f.display();

	}
}
