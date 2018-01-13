package dome;

import java.util.ArrayList;

public class Database {
    private ArrayList<CD> listCD = new ArrayList<CD>();
    private ArrayList<DVD> listDVC = new ArrayList<DVD>();

    private ArrayList<Item> listItem = new ArrayList<Item>();

    public void add(CD cd) {
        listCD.add(cd);
    }

    public void list() {
        for (CD cd : listCD) {
            cd.print();
        }
    }
}
