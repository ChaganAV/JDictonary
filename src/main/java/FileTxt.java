import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileTxt implements Storage{
    File file = new File("employers.txt");
    Employers repository;
    public FileTxt(){
    }
    @Override
    public void save(List<Employer> list) {
        try (FileWriter writer = new FileWriter(file)) {
            for (Employer e : list) {
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

    @Override
    public void load() {

    }
}
