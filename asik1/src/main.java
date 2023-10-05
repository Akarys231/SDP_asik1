public class main {
    public static void main(String[] args) {
        ReservationContext context = new ReservationContext();

        // Выбираем стратегию бронирования по времени
        context.setStrategy(new TimeBasedReservationStrategy());
        boolean timeBasedReservationResult = context.reserveTable(1);

        // Выбираем стратегию бронирования по количеству гостей
        context.setStrategy(new GuestCountBasedReservationStrategy());
        boolean guestCountBasedReservationResult = context.reserveTable(2);

        // Выводим результаты бронирования
        System.out.println("Time-based reservation result: " + timeBasedReservationResult);
        System.out.println("Guest count-based reservation result: " + guestCountBasedReservationResult);
    }
}

