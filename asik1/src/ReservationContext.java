public class ReservationContext {
    private ReservationStrategy strategy;

    public void setStrategy(ReservationStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean reserveTable(int tableNumber) {
        if (strategy != null) {
            return strategy.reserveTable(tableNumber);
        }
        return false;
    }
}
