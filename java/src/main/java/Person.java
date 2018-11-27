public class Person {
    String Firstname;
    String lastname;
    int idnumber;

    public Person(String firstname, String lastname, int idnumber) {
        Firstname = firstname;
        this.lastname = lastname;
        this.idnumber = idnumber;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Firstname='" + Firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", idnumber=" + idnumber +
                '}';
    }
}
