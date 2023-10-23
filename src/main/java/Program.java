import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Employers employers = new Employers();
        employers.add(new Employer("456","Иванов","Иван","Петрович","123-123-123",2));
        employers.add(new Employer("345","Петров","Петр","Никанорыч","456-123-789",4));
        employers.add(new Employer("5","Котов","Александр","Рудольфович","789-183-789",5));
        employers.add(new Employer("98","Кузнецова","Анна","Михайловна","785-128-746",7));
        employers.add(new Employer("21","Сидоров","Петр","Владимирович","156-124-129",3));
        employers.add(new Employer("34","Сидорова","Вера","Владимировна","556-224-159",5));

        System.out.println("--поиск по стажу--");
        List<Employer> listEmp = employers.findByWorkExp(5);
        for (Employer emp: listEmp) {
            System.out.println(emp);
        }
        System.out.println("-- вывод телефона по имени сотрудника--");
        employers.selectPhoneByFirstName("Петр");

        System.out.println("--табельный номер--");
        System.out.println(employers.findByTabnum("98"));
        employers.save();
    }
}
