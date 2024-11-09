public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.surname = "Иванов";
        post.name = "Иван";
        post.patronymic = "Иванович";
        post.passport = "4444 №444444";
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;
        post.phone = "+7 (999) 999-99-99";
        post.subscription = true;
    }
}
