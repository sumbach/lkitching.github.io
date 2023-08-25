public class Greet {
    private final String name;
    public Greet(String name) {
	    this.name = name;
    }

    public void greet() {
	    System.out.println("Hello " + this.name);
    }

    public static void main(String[] args) {
	    Greet g = new Greet(args[0]);
	    g.greet();
    }
}
