public class Main {
    public static void main(String[] args) {
        //Задание номер 1
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        //Задание номер 2
        String upperFullName = fullName.toUpperCase();
        System.out.println(upperFullName);

        //Задание номер 3
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println(fullName);
    }
}