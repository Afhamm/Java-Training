class Testingg {

    int x = 10;
    static int y = 20;
	void doIt () {
	System.out.println("Hi");
    }

    static void dontDo() {
	System.out.println("Bye");
    }

    public static void main(String args[]) {
	
	Testingg t1 = new Testingg();

	System.out.println("x:" + y);
	
	t1.doIt();
	
	//doIt();
	
	//t1.dontDo();
	
    }
}