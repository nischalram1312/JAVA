public class M1 {
        String Name, FName, universityId, userId;
        int semester;

    public void setData(String Name, String FName, String universityId, String userId, int semester){
        this.Name=Name;
        this.FName=FName;
        this.universityId=universityId;
        this.userId=userId;
        this.semester=semester;
    }
    public void getData(){
        System.out.println("Student Name  : "+Name);
        System.out.println("Father Name   : "+FName);
        System.out.println("University Id : "+universityId);
        System.out.println("User Id       : "+userId);
        System.out.println("Semester      : "+semester);
    }
}
