class Student {
	String index;
	String firstName;
	String lastName;
	int [] labPoints;
	//TODO constructor
	public Student(String index, String firstName, String last name, int [] labPoints) {
		this.index=index;
		this.firstName=firstName;
		this.lastName=lastName;
		this.labPoints=labPoints;
	}
	//TODO seters & getters
	public String getIndex() {
		return index;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int [] getLabPoints() {
		return labPoints;
	}
	public String setFirstName(String pom) {
		firstName=pom;
	}
	public String setIndex(String pom) {
		index=pom;
	}
	public String setLastName(String pom) {
		lastName=pom;
	}
	public int [] setLabPoints(int[] pom) {
		labPoints=pom;
	}
	public double getAverage() {
		//TODO
		int sum=0;
		for(int i=0;i<labPoints.length;i++) {
			sum+=labPoints[i];
		}
		return sum;
	}
	public boolean hasSignature() {
		//TODO
		if(labPoints.length<=8) {
			return true;
		}else {
			return false;
		}
	}
}
