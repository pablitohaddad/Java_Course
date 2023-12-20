package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(){

    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }


    public Date getCheckOut() {
        return checkOut;
    }

    public long duration(){ // para retornar a diferença entre datas em java.
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkIn, Date checkOut){ // Jogando os possiveis erros para a classe Reservation date

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)){
            return "Error in reservation: Reservation dates for update must be future dates";
        }
        if(!checkOut.after(checkIn)){
            return  "Error in reservation: Check-out date must be after check-in date";
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        return null; // Se nao houver erro, nao retorna nada
    }

    @Override
    public String toString() {
        return "Room"
                + roomNumber
                + ", check-in: "
                + sdf.format(checkIn)
                + ", check-out: "
                + sdf.format(checkOut)
                + ", "
                + duration()
                + " nigths";
    }
}
