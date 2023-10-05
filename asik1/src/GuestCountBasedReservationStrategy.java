public class GuestCountBasedReservationStrategy implements ReservationStrategy {
    @Override
    public boolean reserveTable(int tableNumber) {
        // Реализация бронирования по количеству гостей
        // Проверяем доступность стола и резервируем его
        return true; // успешное бронирование
    }
}