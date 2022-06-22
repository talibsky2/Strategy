public class Parliament {
    Order order;
    public void setOrder(Order order) {
        this.order = order;
    }
    public void applyOrder (){
        order.setNewOrder();
    }
}
