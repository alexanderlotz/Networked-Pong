import sample.Main;

/**
 * Solely exists to overcome Gradle JavaFX issues as described
 * in <a href="https://github.com/openjfx/javafx-gradle-plugin/issues/31">
 *     this OpenJFX issue on GitHub</a>.
 */
public final class TempMain {
    /**
     * Private default constructor for helper class.
     */
    private TempMain() {

    }
    /**
     * Helper to execute the actual JavaFX main in {@link sample.Main}.
     * @param args Takes in command line arguments.
     */
    public static void main(final String[] args) {
        Main.main(args);
    }
}
