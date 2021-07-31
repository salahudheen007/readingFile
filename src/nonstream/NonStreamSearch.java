package nonstream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NonStreamSearch {
    public static void main(String[] args) throws IOException {
        File myfile = new File("C:\\Users\\salah\\IdeaProjects\\reading_file\\data.csv");
        BufferedReader br = new BufferedReader(new FileReader(myfile));
        ArrayList policies = new ArrayList();
        String data = br.readLine();
        while ((data = br.readLine()) != null) {
            Policy policy = new Policy(data);
            policies.add(policy);

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("search by id(a) or construction type(b)");
        String option = sc.nextLine();
        if (option.equals("a")) {
            System.out.println("enter the id");
            int id = sc.nextInt();
            if (id >= 100000 && id <= 999999) {
                for (int i = 0; i < policies.size(); i++) {
                    Policy mypolicy = (Policy) policies.get(i);
                    if (id == mypolicy.getId()) {
                        System.out.println(mypolicy);
                        return;
                    }
                }
                System.out.println("id not found");
            } else {
                System.out.println("enter valid id");
            }
        } else if (option.equals("b")) {
            int granularitySum = 0, count = 0;
            System.out.println("enter construction type");
            String constrctionType = sc.nextLine();
            for (int i = 0; i < policies.size(); i++) {
                Policy mypolicy = (Policy) policies.get(i);
                if (constrctionType.equals(mypolicy.getConstructionType())) {
                    count++;
                    granularitySum = granularitySum + mypolicy.getPointGranularity();
                }
            }
            if (count != 0) {
                System.out.println("sum Granularity : " + granularitySum + "\n" + "count : " + count);
            }else {
                System.out.println("construction type not found");
            }
        } else {
            System.out.println("enter a valid option");
        }


    }
}
