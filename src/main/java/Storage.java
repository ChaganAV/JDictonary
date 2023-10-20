import java.util.List;

public interface Storage {
    void save(List<Employer> list);
    void load();
}
