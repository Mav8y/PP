//package hibernate_test.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.stereotype.Controller;
import java.sql.Types;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Entity
@Table(name = "example")
@Controller
public class Employee {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="date")
    private String date;
    @Column(name="description")
    private String description;



    public Employee() {

    }

    public Employee(String name, String date, String description) {
        this.name = name;
        this.date = date;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + date + '\'' +
                ", department='" + description + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
