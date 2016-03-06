package controller;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author xiaozhongbao
 * @date 16-3-6
 */
public class Employee {
    @Autowired
    private PersonInfo personInfo;
    private  int id;
    private  String position;

    public PersonInfo getPersonInfo() {
        return personInfo;
    }

    public void setPersonInfo(PersonInfo personInfo) {
        this.personInfo = personInfo;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personInfo=" + personInfo +
                ", id=" + id +
                ", position='" + position + '\'' +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
