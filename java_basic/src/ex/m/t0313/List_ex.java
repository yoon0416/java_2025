package ex.m.t0313;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class UserInfo {
    private String name;
    private int age;

    public UserInfo(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }

    public String getName() { return name; }  public void setName(String name) { this.name = name; }  public int getAge() { return age; }  public void setAge(int age) { this.age = age; }
}

public class List_ex {

    public static void main(String[] args) {
        // Q7. list
    	System.out.println("List");
    	
        List<UserInfo> users = new ArrayList<>();
        users.add(new UserInfo("iron", 45));
        users.add(new UserInfo("hulk", 38));
        users.add(new UserInfo("captain", 120));

        System.out.println("============================= \n"
                + "NO \t NAME \t AGE \n"
                + "=============================");

        int hap = 0;
        Iterator<UserInfo> iterator = users.iterator();
        int index = 0;

        while (iterator.hasNext()) {
            UserInfo uf = iterator.next();
            hap = hap + uf.getAge();
            index++;
            System.out.println(index + "\t" + uf.getName() + "\t" + uf.getAge());
        }

        System.out.println("나이총합 : " + hap);
        System.out.printf("나이평균 : %.2f\n \n", (double) hap / users.size());

        
      //--------------------------------------------------------------------------------------------
        
        // Q8. set
    	System.out.println("Set");
        Set<UserInfo> userSet = new HashSet<>();
        userSet.add(new UserInfo("iron", 45));
        userSet.add(new UserInfo("hulk", 38));
        userSet.add(new UserInfo("captain", 120));

        System.out.println("=============================\r\n"
                + "NO \t NAME \t AGE\r\n"
                + "=============================");

        hap = 0;
        iterator = userSet.iterator();
        index = 0;

        while (iterator.hasNext()) {
            UserInfo uf = iterator.next();
            hap = hap + uf.getAge();
            index++;
            System.out.println(index + "\t" + uf.getName() + "\t" + uf.getAge());
        }

        System.out.println("나이총합 : " + hap);
        System.out.printf("나이평균 : %.2f\n \n", (double) hap / userSet.size());

//--------------------------------------------------------------------------------------------
        // Q9. map
    	System.out.println("map");
    	
        Map<String, UserInfo> userMap = new HashMap<>();
        userMap.put("iron", new UserInfo("iron", 45));
        userMap.put("hulk", new UserInfo("hulk", 38));
        userMap.put("captain", new UserInfo("captain", 120));

        System.out.println("=============================\r\n"
                + "NO \t NAME \t AGE\r\n"
                + "=============================");

        hap = 0;
        iterator = userMap.values().iterator();
        index = 0;

        while (iterator.hasNext()) {
            UserInfo uf = iterator.next();
            hap = hap + uf.getAge();
            index++;
            System.out.println(index + "\t" + uf.getName() + "\t" + uf.getAge());
        }

        System.out.println("나이총합 : " + hap);
        System.out.printf("나이평균 : %.2f\n", (double) hap / userMap.size());
    }
}
