package collectionsFramework.cursors;

public class Laptop {
    int model ;
    String companyName;

    Laptop(int model , String companyName){
        this.model = model;
        this.companyName = companyName;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String  toString(){
        return "{"+model + " " + companyName+"}";
    }
}
