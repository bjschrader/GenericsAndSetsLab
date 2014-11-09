package common2;

import java.util.*;

public class Employee2 {
    private String lastName;
    private String firstName;
    private String ssn;

    public Employee2(String lastName, String firstName, String ssn) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Employee2{" + "ssn=" + ssn + '}';
    }

    /**
     *
     * @ovverride hashCode and equals must be done here to remove blind
     * inheritance
     */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.ssn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee2 other = (Employee2) obj;
        if (!Objects.equals(this.ssn, other.ssn)) {
            return false;
        }
        return true;
    }

    
    
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    
}