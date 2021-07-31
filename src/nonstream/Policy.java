package nonstream;

public class Policy {
    private int id, pointGranularity;
    private double eqSite, huSite;
    private String stateCode, constructionType;

    public Policy(String dataLine) {
        String[] datas = dataLine.split(",");
        id = Integer.parseInt(datas[0]);
        pointGranularity = Integer.parseInt(datas[17]);
        eqSite = Double.parseDouble(datas[3]);
        huSite = Double.parseDouble(datas[4]);
        stateCode = datas[1];
        constructionType = datas[16];

    }

    public int getId() {
        return id;
    }

    public int getPointGranularity() {
        return pointGranularity;
    }

    public String getConstructionType() {
        return constructionType;
    }

    @Override
    public String toString() {
        return "Policy\n" +
                "   id=" + id +
                "\n   pointGranularity=" + pointGranularity +
                "\n   eqSite=" + eqSite +
                "\n   huSite=" + huSite +
                "\n   stateCode='" + stateCode  +
                "\n   constructioType='" + constructionType;
    }
}
