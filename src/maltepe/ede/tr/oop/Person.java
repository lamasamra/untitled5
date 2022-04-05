package maltepe.ede.tr.oop;

public class Person {

    private String name;
    private int age;
    private String do_sport;


    public int getAge()
    {

        return age;
    }
    public String gatName(){

        return name;
    }
    public String getDo_sport(){

        return do_sport;
    }

    void speak(){
        System.out.printf("Person can swim");
    }
    @Override
    public void swimming(String stud, sport_center sc) {
        sc.addMembers(stud);
        System.out.println("Student going to Sport center to swimming");

}