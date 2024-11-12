package assignment;

public class MobileOnboardingStep implements ProcessStep{
	 @Override
	    public void execute(Context context) {
		 	//Business Logic for Mobile onboarding
	        //System.out.println("Onboarding user through mobile.");
	        context.setData("onboarded", "mobile");
	    }

	    @Override
	    public String getName() {
	        return "Mobile Onboarding Step";
	    }
}
