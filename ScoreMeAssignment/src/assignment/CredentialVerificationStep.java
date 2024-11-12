package assignment;

public class CredentialVerificationStep implements ProcessStep {
    private final String credentialType;

    //credential types could be Aadhaar, PAN, etc
    public CredentialVerificationStep(String credentialType) {
        this.credentialType = credentialType;
    }

    @Override
    public void execute(Context context) {
    	
        System.out.println("Verifying user credentials: " + credentialType);
        
       
        boolean isVerified = verifyCredentials(context, credentialType);
        
        context.setData("verifiedCredentialType", credentialType);
    }

    private boolean verifyCredentials(Context context, String credentialType) {
       //Business logic for verification
    	
    	return true; 	// Return true as of now since no logic is added
    }

    @Override
    public String getName() {
        return "Credential Verification Step (" + credentialType + ")";
    }
}

