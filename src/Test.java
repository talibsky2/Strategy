public class Test {
    public static void main(String[] args) {
        Parliament parliament = new Parliament();

        parliament.setOrder(new Capitalism());
        parliament.applyOrder();

        parliament.setOrder(new Socialism());
        parliament.applyOrder();

        parliament.setOrder(new Communism());
        parliament.applyOrder();


    }
}