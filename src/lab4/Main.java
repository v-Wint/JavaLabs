package lab4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    /**
     * Create array with objects
     * Sort them by one field ascending, by other descending
     */
    public static void main(String[] args) {
        EducationalInstitution[] institutions = generateInstitutions();

        Arrays.sort(institutions, Comparator.comparing(EducationalInstitution::getStudentsCount));
        System.out.println("Sort by students count");
        outputArray(institutions);

        Arrays.sort(institutions, Comparator.comparing(EducationalInstitution::getEstablishmentDate).reversed());
        System.out.println("\nSort by date");
        outputArray(institutions);
    }

    /**
     * Generate array of 5 education instituions objects
     * @return array of objects
     */
    public static EducationalInstitution[] generateInstitutions() {
        EducationalInstitution[] institutions = new EducationalInstitution[4];

        institutions[0] = new EducationalInstitution(
                "НТУУ \"КПІ ім. Сікорського\"",
                "university",
                20000,
                "Kyiv",
                LocalDate.of(1898, 1, 1)
        );
        institutions[1] = new EducationalInstitution(
                "ПТУ №44 м. Миргорода",
                "ptu",
                3000,
                "Myrhorod",
                LocalDate.of(1946, 2, 8)
        );
        institutions[2] = new EducationalInstitution(
                "Київська школа № 190",
                "school",
                1100,
                "Kyiv",
                LocalDate.of(1968, 1, 1)
        );
        institutions[3] = new EducationalInstitution(
                "Український католицький університет",
                "university",
                2160,
                "Lviv",
                LocalDate.of(1929, 10, 6)
        );
        return institutions;
    }

    /**
     * Output array of educational instituions objects
     * @param array array to output
     */
    public static void outputArray(EducationalInstitution[] array) {
        for (EducationalInstitution institution : array) {
            System.out.println(institution);
        }
    }
}
