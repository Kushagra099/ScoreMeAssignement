package assignment;

public class Application {
    public static void main(String[] args) {
        Context context = new Context();

        UserOnboardingProcess onboardingProc = new UserOnboardingProcess();
        
        String onboardingTypes = "email";
        String credentialType = "PAN";  // Can be "PAN" or "Aadhaar"
        
        onboardingProc.configureProcess(onboardingTypes, credentialType);

        // Execute the process
        onboardingProc.execute(context);

        // Retrieve final data from Context
        String onboardedVia = context.getData("onboarded", String.class);
        String verifiedCredentialType = context.getData("verifiedCredentialType", String.class);
        Boolean accountExists = context.getData("accountExists", Boolean.class);

        System.out.println("Onboarding completed via: " + onboardedVia);
        System.out.println("Verified credential type: " + verifiedCredentialType);
        System.out.println("Account exists: " + accountExists);
    }
}