package pkg;

import javax.persistence.*;
import java.util.List;

public class DB {

	private static final String DB_URL = "$objectdb/db/library.odb";


    // Add Member
    public static void addMember(Member member) {
        //EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(member);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    // Add Trainer
    public static void addTrainer(Trainer trainer) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(trainer);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    // Add Subscription
    public static void addSubscription(Subscription subscription) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(subscription);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    // Add GymClass
    public static void addGymClass(Gym gymClass) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(gymClass);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

    // Retrieve Member by ID
    public static Member getMemberById(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        Member member = em.find(Member.class, id);
        em.close();
        emf.close();
        return member;
    }

    // Retrieve Trainer by ID
    public static Trainer getTrainerById(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        Trainer trainer = em.find(Trainer.class, id);
        em.close();
        emf.close();
        return trainer;
    }

    // Retrieve Subscription by ID
    public static Subscription getSubscriptionById(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        Subscription subscription = em.find(Subscription.class, id);
        em.close();
        emf.close();
        return subscription;
    }

    // Retrieve GymClass by ID
    public static Gym getGymClassById(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        Gym gymClass = em.find(Gym.class, id);
        em.close();
        emf.close();
        return gymClass;
    }

    // List all Members
    public static List<Member> getAllMembers() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        List<Member> members = em.createQuery("SELECT m FROM Member m", Member.class).getResultList();
        em.close();
        emf.close();
        return members;
    }

    // List all Trainers
    public static List<Trainer> getAllTrainers() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        List<Trainer> trainers = em.createQuery("SELECT t FROM Trainer t", Trainer.class).getResultList();
        em.close();
        emf.close();
        return trainers;
    }

    // List all Subscriptions
    public static List<Subscription> getAllSubscriptions() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        List<Subscription> subscriptions = em.createQuery("SELECT s FROM Subscription s", Subscription.class).getResultList();
        em.close();
        emf.close();
        return subscriptions;
    }

    // List all GymClasses
    public static List<Gym> getAllGymClasses() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory(DB_URL);
        EntityManager em = emf.createEntityManager();
        List<Gym> gym = em.createQuery("SELECT g FROM Gym g", Gym.class).getResultList();
        em.close();
        emf.close();
        return gym;
    }
}

