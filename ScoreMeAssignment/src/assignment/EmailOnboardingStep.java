package assignment;

public class EmailOnboardingStep implements ProcessStep{
	 @Override
	    public void execute(Context context) {
	        // Logic for email onboarding
	        //System.out.println("Onboarding user via email.");
	        context.setData("onboarded", "email");
	    }

	    @Override
	    public String getName() {
	        return "Email Onboarding Step";
	    }
}
