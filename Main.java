package pkg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Add Member");
            System.out.println("2. Add Trainer");
            System.out.println("3. Add Subscription");
            System.out.println("4. Add Gym Class");
            System.out.println("5. View Members");
            System.out.println("6. View Trainers");
            System.out.println("7. View Subscriptions");
            System.out.println("8. View Gym Classes");
            System.out.println("9. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter member name:");
                    String name = sc.nextLine();
                    System.out.println("Enter member email:");
                    String email = sc.nextLine();
                    Member member = new Member(name, email);
                    DB.addMember(member);
                    break;
                case 2:
                    System.out.println("Enter trainer name:");
                    String trainerName = sc.nextLine();
                    System.out.println("Enter trainer specialization:");
                    String specialization = sc.nextLine();
                    Trainer trainer = new Trainer(trainerName, specialization);
                    DB.addTrainer(trainer);
                    break;
                case 3:
                    System.out.println("Enter member ID for subscription:");
                    int memberId = sc.nextInt();
                    sc.nextLine(); // consume the newline character
                    System.out.println("Enter subscription type:");
                    String type = sc.nextLine();
                    System.out.println("Enter start date (YYYY-MM-DD):");
                    String startDate = sc.nextLine();
                    System.out.println("Enter end date (YYYY-MM-DD):");
                    String endDate = sc.nextLine();
                    Subscription subscription = new Subscription(memberId, type, startDate, endDate);
                    DB.addSubscription(subscription);
                    break;
                case 4:
                    System.out.println("Enter gym class name:");
                    String gymClassName = sc.nextLine();
                    System.out.println("Enter schedule (e.g., 10:00 AM - 11:00 AM):");
                    String schedule = sc.nextLine();
                    System.out.println("Enter trainer ID:");
                    int trainerId = sc.nextInt();
                    Gym gymClass = new Gym(gymClassName, schedule, trainerId);
                    DB.addGymClass(gymClass);
                    break;
                case 5:
                    System.out.println("Members:");
                    DB.getAllMembers().forEach(m -> System.out.println(m.getName()));
                    break;
                case 6:
                    System.out.println("Trainers:");
                    DB.getAllTrainers().forEach(t -> System.out.println(t.getName()));
                    break;
                case 7:
                    System.out.println("Subscriptions:");
                    DB.getAllSubscriptions().forEach(s -> System.out.println(s.getType()));
                    break;
                case 8:
                    System.out.println("Gym Classes:");
                    DB.getAllGymClasses().forEach(g -> System.out.println(g.getName()));
                    break;
                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}

