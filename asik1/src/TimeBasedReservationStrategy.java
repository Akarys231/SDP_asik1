public class TimeBasedReservationStrategy implements ReservationStrategy {
    @Override
    public boolean reserveTable(int tableNumber) {
        // Реализация бронирования по времени
        // Проверяем доступность стола и резервируем его
        return true; // успешное бронирование
    }
}