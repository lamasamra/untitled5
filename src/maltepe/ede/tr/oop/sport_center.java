package maltepe.ede.tr.oop;
public class sport_center {

     public void addMembers(String name){
          members.add(name);
     }
     public ArrayList<String> printMembers(){
          System.out.println(members + " is in sport center");

          return members;
     }

     String footballStadium;
     String swimmingPoll;
}
