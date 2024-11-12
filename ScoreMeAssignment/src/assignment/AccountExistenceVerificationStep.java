package assignment;

public class AccountExistenceVerificationStep implements ProcessStep {
    @Override
    public void execute(Context context) {
    	
        // Business logic for account existence check
        //System.out.println("Checking if user's account exists.");
        context.setData("accountExists", true);
    }
        
    @Override
    public String getName() {
        return "Account Existence Verification Step";
    }
    
    
}
