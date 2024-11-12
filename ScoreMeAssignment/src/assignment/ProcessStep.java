package assignment;

public interface ProcessStep {
	void execute(Context context);
    String getName();
}