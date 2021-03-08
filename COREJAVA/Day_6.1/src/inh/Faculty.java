package inh;

public class Faculty extends Person {

	private int expInYears;
	private String sme;

	public Faculty(String fName, String LName, int yrs, String sme) {

		super(fName, LName);
		System.out.println("In Faculty constructor: ");
		this.expInYears = yrs;
		this.sme = sme;

		// point to be noted super should be first statement no statement comes first

	}

	public String toString() {
		return "Faculty_details " + super.toString() + " " + "expirence " + expInYears + " " + "expert " + sme;

	}

	public void evaluate() {
		System.out.println(getLastName() + "evaluating students: ");
	}

}
