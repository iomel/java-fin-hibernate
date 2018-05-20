package final_project.models;

import final_project.utils.BaseEntity;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Entity
@Table(name="ORDERS")
public class Order implements BaseEntity, Comparable<Order> {

    private long id;
    private User user;
    private Room room;
    private Date dateFrom;
    private Date dateTo;
    private double moneyPaid;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d-MMM-yyyy");


    @Id
    @SequenceGenerator(name="PK_ORDER", sequenceName = "ORDER_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_ORDER")
    @Column(name="ID")
    public long getId() {
        return id;
    }

//    @Column(name="COUNTRY")
    public User getUser() {
        return user;
    }

//    @Column(name="COUNTRY")
    public Room getRoom() {
        return room;
    }

    @Column(name="DATE_FROM")
    public Date getDateFrom() {
        return dateFrom;
    }

    @Column(name="DATE_TO")
    public Date getDateTo() {
        return dateTo;
    }

    @Column(name="MONEY_PAID")
    public double getMoneyPaid() {
        return moneyPaid;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public void setMoneyPaid(double moneyPaid) {
        this.moneyPaid = moneyPaid;
    }

    public void setSimpleDateFormat(SimpleDateFormat simpleDateFormat) {
        this.simpleDateFormat = simpleDateFormat;
    }

    @Override
    public int compareTo(Order o) {
        return Long.compare(this.getId(), o.getId());
    }


    @Override
    public String toString() {
        return id +
                "," + user.toString().replaceAll(",", ":").replace("\n","") +
                "," + room.toString().replaceAll(",", ":").replace("\n","") +
                "," + simpleDateFormat.format(dateFrom) + "," + simpleDateFormat.format(dateTo) +
                "," + moneyPaid + "\n";
    }


}
