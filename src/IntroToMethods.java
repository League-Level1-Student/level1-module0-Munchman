
public class IntroToMethods {
public static void main(String[] args) {
	weRock();
	rocker("marc");
}
static void weRock(){
	System.out.println("The Leage rocks!");
	
}

static void rocker(String bob) { 
	System.out.println(bob+" rocks!");
	
}
static void singer(String mm) {
	if (mm.equalsIgnoreCase("eminem")) {
		System.out.println("eminem is awesome");
	}
	else if(mm.equalsIgnoreCase("justin beiber")) {
	
		System.out.println("justin beiber is lame");
	}
}
}
