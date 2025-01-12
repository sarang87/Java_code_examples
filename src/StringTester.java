public class StringTester {
    private String inputString;

    public StringTester() {
    }

    public StringTester(String input) {
        this.inputString = input;
    }

    public boolean evenStringChecker() {
        return inputString.length() % 2 == 0;
    }

    public void setInputString(String input) {
        inputString = input;
    }
}
