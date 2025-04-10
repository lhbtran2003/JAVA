package bai8;

public class InvalidPhoneNumberLengthException extends Exception {
    public InvalidPhoneNumberLengthException() {}

    public InvalidPhoneNumberLengthException(String message) {
        super(message);
    }

    public void  validatePhoneNumber(String phone) throws InvalidPhoneNumberLengthException {
        if (phone == null || phone.length() != 10) {
          throw new InvalidPhoneNumberLengthException("Số điện thoại phải đúng 10 chữ số");
        }
        if (!phone.matches("\\d+")) {
            throw new NumberFormatException("Số điện thoại chứa kí tự ko hợp lệ!");
        }
    }
}
