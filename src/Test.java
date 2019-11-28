public class Test {
    public static void main(String[] args) {
        Test test = new Test();
    }

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
