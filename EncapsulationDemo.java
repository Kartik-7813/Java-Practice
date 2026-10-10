package OOP;

class Test {

    private int test_id;

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }
}

public class EncapsulationDemo {

    static void main(String[] args) {

        Test test = new Test();
        test.setTest_id(1);
        System.out.println(test.getTest_id());
    }

}
