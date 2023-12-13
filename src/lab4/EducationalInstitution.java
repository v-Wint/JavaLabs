package lab4;

import java.time.LocalDate;

/**
 * Represent educational institution
 */
public class EducationalInstitution {
    private String name;
    private String type;
    private String city;
    private int studentsCount;
    private LocalDate establishmentDate;

    /**
     * Class constructor
     * @param name educational institution name
     * @param type type of educational institution (e.g. university, school)
     * @param city city in which is located
     * @param studentsCount number of students
     * @param establishmentDate date of establishment
     */
    public EducationalInstitution(String name, String type, int studentsCount, String city, LocalDate establishmentDate) {
        this.name = name;
        this.type = type;
        this.city = city;
        this.studentsCount = studentsCount;
        this.establishmentDate = establishmentDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }

    public LocalDate getEstablishmentDate() {
        return establishmentDate;
    }

    public void setEstablishmentDate(LocalDate establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    @Override
    public String toString() {
        return "EducationalInstitution{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", studentsCount=" + studentsCount +
                ", establishmentDate=" + establishmentDate +
                '}';
    }
}
