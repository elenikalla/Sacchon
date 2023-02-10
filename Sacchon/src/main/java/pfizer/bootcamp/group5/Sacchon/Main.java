package pfizer.bootcamp.group5.Sacchon;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pfizer.bootcamp.group5.Sacchon.model.Patient;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");

        Patient patient = new Patient();
        patient.setId(2);
        patient.setUsername("Nick");
        patient.setPassword("123");
        patient.setFirstName("Nikos");
        patient.setLastName("Pantiris");
        patient.setEnoughRecordings(false);

        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();

        entityManager.merge(patient);
        entityManager.getTransaction().commit();

        entityManagerFactory.close();
    }
}
