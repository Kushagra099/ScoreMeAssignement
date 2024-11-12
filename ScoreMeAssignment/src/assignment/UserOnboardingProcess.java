package assignment;

import java.util.ArrayList;
import java.util.List;

public class UserOnboardingProcess implements Process {
	 private final List<ProcessStep> steps = new ArrayList<>();

	    @Override
	    public void addStep(ProcessStep step) {
	        steps.add(step);
	    }

	    @Override
	    public void execute(Context context) {
	        for (ProcessStep step : steps) {
	            System.out.println("Executing step: " + step.getName());
	            step.execute(context);
	        }
	    }
	    // configuring processes on the basis of parameters
	    public void configureProcess(String onboardingType, String credentialType) {
	            switch (onboardingType.toLowerCase()) {
	                case "mobile":
	                    addStep(new MobileOnboardingStep());
	                    break;
	                case "email":
	                    addStep(new EmailOnboardingStep());
	                    break;
	                default:
	                    System.out.println("Unknown onboarding type: " + onboardingType);
	                    break;
	            }
	        

	        addStep(new CredentialVerificationStep(credentialType)); // credential type could be PAN or Aadhaar
	        
	        addStep(new AccountExistenceVerificationStep());
	    }
	}