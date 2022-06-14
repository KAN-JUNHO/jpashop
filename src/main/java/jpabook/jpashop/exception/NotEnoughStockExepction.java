package jpabook.jpashop.exception;

public class NotEnoughStockExepction extends RuntimeException{
    public NotEnoughStockExepction() {
        super();
    }

    public NotEnoughStockExepction(String message) {
        super(message);
    }

    public NotEnoughStockExepction(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughStockExepction(Throwable cause) {
        super(cause);
    }

}
