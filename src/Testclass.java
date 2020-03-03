public class Testclass {
    public int testchif;

    public Testclass(int testchif) {
        this.testchif = testchif;
    }

    public int getTestchif() {
        return testchif;
    }

    @Override
    public String toString() {
        return "Testclass{" +
                "testchif=" + testchif +
                '}';
    }
}
