public class Program {
    public static void main(String[] args) {
        Employer employer = new Employer("Иванов","Иван","Петрович");
        employer.setPhone("123-123-123");
        employer.setTabnum("456");
        employer.setWorkExp(6);
        Employers employers = new Employers();
        employers.add(employer);
        employers.save();
    }
}
