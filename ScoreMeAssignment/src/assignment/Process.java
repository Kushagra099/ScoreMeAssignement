package assignment;

public interface Process {
	void addStep(ProcessStep step);
    void execute(Context context);
}
