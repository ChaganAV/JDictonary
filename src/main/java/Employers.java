import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Employers{
    List<Employer> listEmp = new ArrayList<>();
    Storage storage;
    private String fileName = "./src/main/resources/employers.txt";
    public Employers(){

    }
    public Employers(List<Employer> list){
        this.listEmp = list;
    }
    public void add(Employer emp){
        listEmp.add(emp);
    }
    public void addRang(List<Employer> list){
        listEmp.addAll(list);
    }

    /**
     * поиск списка сотрудников по стажу
     * @param wexp стаж
     * @return список сотрудников
     */
    public List<Employer> findByWorkExp(int wexp){
        List<Employer> list = listEmp.stream().filter(we -> we.getWorkExp()==wexp).toList();
        return list;
    }
    public void selectPhoneByFirstName(String name){
        Collections.sort(listEmp, new PhoneComparator());
        List<Employer> list = listEmp.stream().filter(e -> e.getFirstName()==name).toList();
        // на полученном листе не получается отсортировать
        //list.sort(new PhoneComparator());
//        list.sort(new Comparator<Employer>() {
//            @Override
//            public int compare(Employer o1, Employer o2) {
//                return o1.getPhone().compareTo(o2.getPhone());
//            }
//        });
        for (Employer emp: list) {
            System.out.println(emp.getPhone());
        }

    }
    public Employer findByTabnum(String tabnum){
        List<Employer> list = listEmp.stream().filter(e -> e.getTabnum() == tabnum).toList();
        for (Employer emp: list) {
            return emp;
        }
        return null;
    }
    /**
     * сохранение списка сотрудников
     */
    public void save(){
        File file = new File("./src/main/resources/employers.txt");
        try (FileWriter writer = new FileWriter(file)) {
            for (Employer e : listEmp) {
                String emp = String.format("%s;%s;%s;%s;%s;%s;",
                        e.getTabnum(),
                        e.getLastName(),
                        e.getFirstName(),
                        e.getSecondName(),
                        e.getPhone(),
                        e.getWorkExp());
                writer.write(emp+"\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
