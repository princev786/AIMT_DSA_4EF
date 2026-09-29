class Institution{
    private int id;
    private String name;
    private int noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;
    String Rating;

    int getid(){
        return this.id;
    }
    void setid(int id){
        this.id = id;
    }
    String getName(){
        return this.name;
    }
    void setName(String name){
        this.name =name;
    }
    int getnoOfStudentsPlaced(){
        return this.noOfStudentsPlaced;
    }
    void setnoOfStudentslaced(int noOfStudentsPlaced){
        this.noOfStudentsPlaced =noOfStudentsPlaced;
    }
    int getnoOfStudentsCleared(){
        return this.noOfStudentsCleared;
    }
    void setnoOfStudentCleared(int noOfStudentsCleared){
        this.noOfStudentsCleared =noOfStudentsCleared;
    }
    String getLocation(){
        return this.location;
    }
    void setLocation(String location){
        this.location =location;
    }
    String getGrade(){
        return this.grade;
    }
    void setGrade(String grade){
        this.grade =grade;
    }

}
public class Encaps1 {
    static int FindNumClearancedByLoc(Institution[] arr,String location){
        int sum =0;
        for(Institution obj : arr){
            if(obj.getLocation().equalsIgnoreCase(location)){
                sum += obj.getnoOfStudentsCleared();
            }
        }
        return sum;
    }
    static Institution UpdateInstitutionGrade(String InstitutionName,Institution[] arr){
        for(Institution obj : arr){
            if(obj.getName().equalsIgnoreCase(InstitutionName)){
                int temp = (obj.getnoOfStudentsPlaced() * 100)/obj.getnoOfStudentsCleared();
                if(temp>=80){
                    obj.Rating = "A";
                }else{
                    obj.Rating = "B";
                }
                return obj;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        
    }
}
