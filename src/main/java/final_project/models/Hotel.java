package final_project.models;

import final_project.utils.BaseEntity;
import javax.persistence.*;

@Entity
@Table(name="HOTELS")
public class Hotel implements BaseEntity, Comparable<Hotel> {

    private long id;
    private String hotelName;
    private String country;
    private String city;
    private String street;


    @Id
    @SequenceGenerator(name="PK_HOTEL", sequenceName = "HOTEL_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PK_HOTEL")
    @Column(name="ID")
    public long getId() {
        return id;
    }

    @Column(name="COUNTRY")
    public String getCountry() {
        return country;
    }

    @Column(name="HOTEL_NAME")
    public String getHotelName() {
        return hotelName;
    }

    @Column(name="CITY")
    public String getCity() {
        return city;
    }

    @Column(name="STREET")
    public String getStreet() {
        return street;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public int compareTo(Hotel o) {
        return Long.compare(this.getId(), o.getId());
    }

    @Override
    public String toString() {
        return id +"," + hotelName + "," + country +"," + city + "," + street + "\n";
    }

}
