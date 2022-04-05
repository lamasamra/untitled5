package maltepe.ede.tr.oop;

class Professor extends Person implements do_sport {
    public Professor() {

    }
    private int pro_ID;

    @Override
    public void playingFootball(String prof, sport_center sc){
        sc.addMembers(prof);
        System.out.println("Prof going to Sport center to play football");
/*
    public void setPro_ID (int pi) {

        pro_ID = pi;
    }
    public int getpro_ID() {
        return pro_ID;

    }

    public void setName1 (String n){

       pro_name=n;
    }
    public String getName1(){
        return pro_name;
    }


}
    void teaches () {

        //System.out.println("prof"+prof_name+"is teaching now" )
    }

 */
}