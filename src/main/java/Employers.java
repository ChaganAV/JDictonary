import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Employers {
    List<Employer> repository = new ArrayList<>();
    private String fileName = "./src/main/resources/employers.txt";
    public Employers(){}
    public Employers(List<Employer> list){
        this.repository = list;
    }
    public void add(Employer emp){
        repository.add(emp);
    }
    public void addRang(List<Employer> list){
        repository.addAll(list);
    }
    public void save(){
        File file = new File(fileName);
        try (FileWriter writer = new FileWriter(file)) {
            for (Employer e : repository) {
                String emp = String.format("%s;%s;%s;%s;%s;%s;%s;",
                        e.getTabnum(),
                        e.getLastName(),
                        e.getFirstName(),
                        e.getSecondName(), "",
                        //e.getBirthday().toString(),
                        e.getPhone(),
                        e.getWorkExp());
                writer.write(emp);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
